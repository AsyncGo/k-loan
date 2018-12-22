package com.kloan.mapper.usercenter;

import com.kloan.entity.usercenter.RigisterChannel;
import com.kloan.entity.usercenter.UserDevice;
import com.kloan.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDeviceMapper extends BaseMapper<UserDevice> {

    //查找用户最近使用（登录）设备
    @Select("select * from user_device where user_id=#{user_id} order by id desc limit 1")
    UserDevice findByUserId(int user_id);

}
