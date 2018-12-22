package com.kloan.mapper.usercenter;

import com.kloan.entity.usercenter.RigisterChannel;
import com.kloan.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper extends BaseMapper<RigisterChannel> {

    @Select("select * from rigister_channel where user_id=#{user_id} order by id desc limit 1")
    RigisterChannel findBySerialId(int user_id);

    @Select("select * from rigister_channel where user_id=#{user_id} order by id desc limit 1 for update")
    RigisterChannel findBySerialIdForUpdate(int user_id);

}
