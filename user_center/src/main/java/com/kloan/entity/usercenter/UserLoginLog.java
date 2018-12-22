package com.kloan.entity.usercenter;

import com.kloan.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.math.BigDecimal;
import java.io.Serializable;



/**
 * 
 * <p>Title: user_login_log -  : Value Object</p> 
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
public class UserLoginLog extends BaseEntity
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
	//其他登录信息汇总，填写易于解析的格式
	private String deviceInfo = null;
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
	public String getDeviceId()
	{
		return this.deviceId;
	}
	public void setDeviceId(String deviceId)
	{
		this.deviceId = deviceId;
	}
	public String getDeviceInfo()
	{
		return this.deviceInfo;
	}
	public void setDeviceInfo(String deviceInfo)
	{
		this.deviceInfo = deviceInfo;
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
