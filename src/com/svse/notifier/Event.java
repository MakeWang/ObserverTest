package com.svse.notifier;

import java.lang.reflect.Method;

/**
 * 事件对象封装类
 * @author Administrator
 *
 */
public class Event {
	
	//执行方法的对象
	private Object object;
	//要执行的方法名称
	private String methName;
	//要执行的方法参数
	private Object[] args;
	//要执行的方法参数类型
	private Class[] paramTypes;
	
	public Event(){
		
	}
	
	public Event(Object obj,String methName,Object... args){
		this.object = obj;
		this.methName = methName;
		this.args = args;
		contractParaTypes(this.args);
	}
	
	//根据参数数组生成参数类型数组
	private void contractParaTypes(Object[] params){
		this.paramTypes = new Class[params.length];
		for (int i = 0; i < params.length; i++) {
			this.paramTypes[i] = params[i].getClass();
		}
	}
	/**
	 * 根据该对象的方法名，方法参数，利用放射机制，执行该方法
	 * @throws Exception
	 */
	public void invoke() throws Exception{
		//System.out.println("getMethName()"+this.getMethName()+",,,"+this.getParamTypes());
		Method method=object.getClass().getMethod(this.getMethName(),this.getParamTypes());
		if(method == null){
			return;
		}
		method.invoke(this.getObject(), this.getArgs());
	}
	
	public Object getObject(){
		return object;
	}
	
	
	public String getMethName() {
		return methName;
	}

	public void setMethName(String methName) {
		this.methName = methName;
	}

	public Object[] getArgs() {
		return args;
	}

	public void setArgs(Object[] args) {
		this.args = args;
	}

	public Class[] getParamTypes() {
		return paramTypes;
	}

	public void setParamTypes(Class[] paramTypes) {
		this.paramTypes = paramTypes;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	
}
