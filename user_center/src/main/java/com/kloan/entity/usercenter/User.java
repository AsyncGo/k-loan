package com.kloan.entity.usercenter;

import com.kloan.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.math.BigDecimal;
import java.io.Serializable;



/**
 * 
 * <p>Title: user_test -  : Value Object</p> 
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
public class User extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	//自增序号
	private Long id = null;
	//用户顺序编号，对外暴露时需要模糊处理
	private Long userId = null;
	//用户名（昵称）,入库做长度校验
	private String userName = null;
	//用户手机号码，入库做格式校验，18位兼容企业用户座机号码
	private String mobile = null;
	//MD5单向加密密码，用注册时间加盐
	private String password = null;
	//用户类别，0-普通用户，1-vip用户
	private Short type = null;
	//用户状态，0-正常，1-冻结，2-标黑 等等
	private Short status = null;
	//注册时间戳
	private Integer rigisterTime = null;
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
	public String getUserName()
	{
		return this.userName;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public String getMobile()
	{
		return this.mobile;
	}
	public void setMobile(String mobile)
	{
		this.mobile = mobile;
	}
	public String getPassword()
	{
		return this.password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public Short getType()
	{
		return this.type;
	}
	public void setType(Short type)
	{
		this.type = type;
	}
	public Short getStatus()
	{
		return this.status;
	}
	public void setStatus(Short status)
	{
		this.status = status;
	}
	public Integer getRigisterTime()
	{
		return this.rigisterTime;
	}
	public void setRigisterTime(Integer rigisterTime)
	{
		this.rigisterTime = rigisterTime;
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
