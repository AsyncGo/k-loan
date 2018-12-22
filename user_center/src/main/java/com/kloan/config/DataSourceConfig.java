package com.kloan.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: AsyncGo
 * Date:   2018/8/20 19:37
 * Description:
 **/
@Data
@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
public class DataSourceConfig {

    private Map<String, HikariConfig> configs = new HashMap<String, HikariConfig>();

    @Bean
    @Primary
    public DataSource dataSource() {
        HashMap<Object, Object> sources = new HashMap<>();
        for (String name : configs.keySet()) {
            sources.put(name, new HikariDataSource(configs.get(name)));
        }

        DataSourceDynamicRouter sourceRouter = new DataSourceDynamicRouter();
        sourceRouter.setTargetDataSources(sources);
        sourceRouter.setDefaultTargetDataSource(sources.get("user_center_master"));
        return sourceRouter;
    }
}
