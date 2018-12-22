package com.kloan.entity.usercenter;

import com.kloan.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.math.BigDecimal;
import java.io.Serializable;



/**
 * 
 * <p>Title: user_device -  : Value Object</p> 
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
public class UserDevice extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	//自增序号
	private Long id = null;
	//用户顺序编号，对外暴露时需要模糊处理
	private Long userId = null;
	//用户登录设备ID
	private String deviceId = null;
	//最后登录时间
	private Integer ctime = null;

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
	public String getDeviceId()
	{
		return this.deviceId;
	}
	public void setDeviceId(String deviceId)
	{
		this.deviceId = deviceId;
	}
	public Integer getCtime()
	{
		return this.ctime;
	}
	public void setCtime(Integer ctime)
	{
		this.ctime = ctime;
	}
	
}
