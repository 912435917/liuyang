/** 
 * <pre>项目名称:shop-admin 
 * 文件名称:systemEnum.java 
 * 包名:com.fh.shop.admin.common 
 * 创建日期:2018年10月19日下午1:59:32 
 * Copyright (c) 2018, 1850645283@qq.com All Rights Reserved.</pre> 
 */  
package com.fh.common;


public enum SystemEnum implements IEnum{
	ERROR_INFO(300, "error"),
	SUCCESS_INFO(200, "ok");


	private int code;

	private String msg;

	private SystemEnum(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	@Override
	public int getCode() {
		return 0;
	}

	@Override
	public String getMsg() {
		return null;
	}
}