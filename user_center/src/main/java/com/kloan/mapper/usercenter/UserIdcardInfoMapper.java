package com.kloan.mapper.usercenter;

import com.kloan.entity.usercenter.RigisterChannel;
import com.kloan.entity.usercenter.UserIdcardInfo;
import com.kloan.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserIdcardInfoMapper extends BaseMapper<UserIdcardInfo> {

    //根据id_no查找实名记录
    @Select("select * from user_idcard_info where id_no='#{id_no}' order by id desc limit 1")
    UserIdcardInfo findByIdNo(int id_no);

}
