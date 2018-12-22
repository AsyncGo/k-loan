package com.kloan.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Author: Hardy
 * Date:   2018/8/20 20:29
 * Description:
 **/
public class DataSourceDynamicRouter extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return "USER_CENTER_MASTER";
    }
}
