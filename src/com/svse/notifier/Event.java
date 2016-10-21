package com.svse.notifier;

import java.lang.reflect.Method;

/**
 * �¼������װ��
 * @author Administrator
 *
 */
public class Event {
	
	//ִ�з����Ķ���
	private Object object;
	//Ҫִ�еķ�������
	private String methName;
	//Ҫִ�еķ�������
	private Object[] args;
	//Ҫִ�еķ�����������
	private Class[] paramTypes;
	
	public Event(){
		
	}
	
	public Event(Object obj,String methName,Object... args){
		this.object = obj;
		this.methName = methName;
		this.args = args;
		contractParaTypes(this.args);
	}
	
	//���ݲ����������ɲ�����������
	private void contractParaTypes(Object[] params){
		this.paramTypes = new Class[params.length];
		for (int i = 0; i < params.length; i++) {
			this.paramTypes[i] = params[i].getClass();
		}
	}
	/**
	 * ���ݸö���ķ��������������������÷�����ƣ�ִ�и÷���
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
