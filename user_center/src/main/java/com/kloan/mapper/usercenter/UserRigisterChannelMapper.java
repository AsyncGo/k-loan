package com.kloan.mapper.usercenter;

import com.kloan.entity.usercenter.RigisterChannel;
import com.kloan.entity.usercenter.UserRigisterChannel;
import com.kloan.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserRigisterChannelMapper extends BaseMapper<UserRigisterChannel> {

    @Select("select * from user_rigister_channel where user_id=#{user_id} order by id desc limit 1")
    UserRigisterChannel findBySerialId(int user_id);

    @Select("select * from rigister_channel where user_id=#{user_id} order by id desc limit 1 for update")
    UserRigisterChannel findBySerialIdForUpdate(int user_id);

}
