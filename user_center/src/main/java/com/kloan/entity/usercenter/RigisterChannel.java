package com.kloan.entity.usercenter;

import com.kloan.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.math.BigDecimal;
import java.io.Serializable;



/**
 * 
 * <p>Title: rigister_channel -  : Value Object</p> 
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
public class RigisterChannel extends BaseEntity
{
	//****************************************************************************
	//fields
	//****************************************************************************
	//自增序号
	private Long id = null;
	//渠道描述，如：mct.alibaba  代表一级渠道alibaba，二级渠道mct
	private String channel = null;
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
	public String getChannel()
	{
		return this.channel;
	}
	public void setChannel(String channel)
	{
		this.channel = channel;
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
