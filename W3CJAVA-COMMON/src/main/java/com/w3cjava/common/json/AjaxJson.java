package com.w3cjava.common.json;

import java.util.LinkedHashMap;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.w3cjava.common.mapper.JsonMapper;

/**
 * 
 * @version v1.0.0
 * @author heartma
 * @date 2017年12月27日
 * @File AjaxJson.java
 * @URL www.w3cjava.com
 * @Desc $.ajax后需要接受的JSON
 */
public class AjaxJson {

	private boolean success = true;// 是否成功
	private String errorCode = "-1";// 错误代码
	private String msg = "操作成功";// 提示信息
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private LinkedHashMap<String, Object> body = new LinkedHashMap();// 封装json的map

	public LinkedHashMap<String, Object> getBody() {
		return body;
	}

	public void setBody(LinkedHashMap<String, Object> body) {
		this.body = body;
	}

	public void put(String key, Object value) {// 向json中添加属性，在js中访问，请调用data.map.key
		body.put(key, value);
	}

	public void remove(String key) {
		body.remove(key);
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {// 向json中添加属性，在js中访问，请调用data.msg
		this.msg = msg;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	@JsonIgnore
	// 返回对象时忽略此属性
	public String getJsonStr() {// 返回json字符串数组，将访问msg和key的方式统一化，都使用data.key的方式直接访问。

		String json = JsonMapper.getInstance().toJson(this);
		return json;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}
}
