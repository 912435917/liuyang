/** 
 * <pre>项目名称:shop-admin 
 * 文件名称:ServerResponse.java 
 * 包名:com.fh.shop.admin.common 
 * 创建日期:2018年10月18日下午6:30:31 
 * Copyright (c) 2018, 1850645283@qq.com All Rights Reserved.</pre> 
 */  
package com.fh.common;

import java.io.Serializable;


public class ServerResponse<T> implements Serializable{


	private static final long serialVersionUID = 413284260391013199L;
	private Integer code;
	
	private String msg;
	
	private T data;



	public ServerResponse(Integer code,String msg,T data){
		this.code=code;
		this.msg=msg;
		this.data=data;
	}
	public ServerResponse(){

	}

	public static <T> ServerResponse<T> success(T data){
		return new ServerResponse<T>(SystemEnum.SUCCESS_INFO.getCode(), SystemEnum.SUCCESS_INFO.getMsg(), data);
	}
	public static ServerResponse success(){
		return new ServerResponse(SystemEnum.SUCCESS_INFO.getCode(), SystemEnum.SUCCESS_INFO.getMsg(), null);
	}
	public static ServerResponse error(IEnum systemEnum){
		return new ServerResponse(systemEnum.getCode(), systemEnum.getMsg(), null);
	}
	public static ServerResponse error(){
		return new ServerResponse(SystemEnum.ERROR_INFO.getCode(), SystemEnum.ERROR_INFO.getMsg(), null);
	}
	public static ServerResponse error(Integer code,String msg){
		return new ServerResponse(code, msg, null);
	}

	public Integer getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	public T getData() {
		return data;
	}
	
	
	
	
}
