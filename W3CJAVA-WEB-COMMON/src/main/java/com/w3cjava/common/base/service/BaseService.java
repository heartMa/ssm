package com.w3cjava.common.base.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @projectNam：		W3cJava
 * @title：			BaseService
 * @author:			HeartMa E-mail：netheartma@gmail.com
 * @url:			http://www.w3cjava.com
 * @time：			2018-4-22 下午11:42:59
 * @description:	Service基类
 */
@Transactional(readOnly = true)
public abstract class BaseService {

	/**
	 * 日志对象
	 */
	protected Logger logger = LoggerFactory.getLogger(getClass());
}
