package com.kloan.mapper.usercenter;

import com.kloan.entity.usercenter.RigisterChannel;
import com.kloan.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserLoginLogMapper extends BaseMapper<RigisterChannel> {

    @Select("select * from #{tbl_name} where user_id=#{user_id} order by id desc limit #{limit}")
    RigisterChannel findByUserId(int user_id, String tbl_name, Integer limit);

}
