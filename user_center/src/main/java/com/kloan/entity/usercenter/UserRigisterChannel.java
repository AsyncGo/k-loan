package com.kloan.entity.usercenter;

import com.kloan.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.math.BigDecimal;
import java.io.Serializable;



/**
 * 
 * <p>Title: user_rigister_channel -  : Value Object</p> 
 * 
 * <p>Copyright: Copyright (c) 2018</p> 
 * 
 * <p>Company: kloan.com</p>
 * 
 * @author 	AsyncGo
 * @date 	2018-12-22
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserRigisterChannel extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	//自增序号
	private Long id = null;
	//用户顺序编号，对外暴露时需要模糊处理
	private Long userId = null;
	//渠道编号，ID代表含义见rigister_channel表
	private Integer channelId = null;
	//录入时间戳
	private Integer ctime = null;
	//更新时间戳
	private Integer utime = null;

	//****************************************************************************
	//accessors
	//****************************************************************************
	public Long getId()
	{
		return this.id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	public Long getUserId()
	{
		return this.userId;
	}
	public void setUserId(Long userId)
	{
		this.userId = userId;
	}
	public Integer getChannelId()
	{
		return this.channelId;
	}
	public void setChannelId(Integer channelId)
	{
		this.channelId = channelId;
	}
	public Integer getCtime()
	{
		return this.ctime;
	}
	public void setCtime(Integer ctime)
	{
		this.ctime = ctime;
	}
	public Integer getUtime()
	{
		return this.utime;
	}
	public void setUtime(Integer utime)
	{
		this.utime = utime;
	}
	
}
