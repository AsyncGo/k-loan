package com.kloan.entity.usercenter;

import com.kloan.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.math.BigDecimal;
import java.io.Serializable;



/**
 * 
 * <p>Title: user_idcard_info -  : Value Object</p> 
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
public class UserIdcardInfo extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	//自增序号
	private Long id = null;
	//用户顺序编号，对外暴露时需要模糊处理
	private Long userId = null;
	//ID
	private String idNo = null;
	//实名信息，入库需要加密
	private String idName = null;
	//0-身份证，1-护照
	private Short type = null;
	//记录状态，0-正常，1-失效
	private Short status = null;
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
	public String getIdNo()
	{
		return this.idNo;
	}
	public void setIdNo(String idNo)
	{
		this.idNo = idNo;
	}
	public String getIdName()
	{
		return this.idName;
	}
	public void setIdName(String idName)
	{
		this.idName = idName;
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
