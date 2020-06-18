package com.qxj.cloud.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class PreZuulFilter extends ZuulFilter{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PreZuulFilter.class);
	/**
	 * 表示是否使用该过滤器
	 */
	@Override
	public boolean shouldFilter() {
		return true;
	}
	
	/**
	 * 具体的过滤执行逻辑
	 */
	@Override
	public Object run() throws ZuulException {
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		String host = request.getRemoteHost();
		PreZuulFilter.LOGGER.info("请求的host:{}", host);
		return null;
	}
	
	/**
	 * 过滤器类型
	 * 
	 */
	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}
	
	/**
	 * 过滤器执行顺序。返回值越小，执行顺序越优先。
	 */
	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
