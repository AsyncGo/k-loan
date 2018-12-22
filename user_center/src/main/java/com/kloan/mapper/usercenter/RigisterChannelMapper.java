package com.kloan.mapper.usercenter;

import com.kloan.entity.usercenter.RigisterChannel;
import com.kloan.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface RigisterChannelMapper extends BaseMapper<RigisterChannel> {

    //通过ID查找记录
    @Select("select * from rigister_channel where id=#{id} order by id desc limit 1")
    RigisterChannel findById(int id);

    //通过ID查找记录并锁定
    @Select("select * from rigister_channel where id=#{id} id by id desc limit 1 for update")
    RigisterChannel findByIdForUpdate(int id);

    //查看全部渠道
    @Select("select * from rigister_channel")
    List<RigisterChannel> findAllRigisterChannel();

}
