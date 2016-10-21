package com.svse.notifier;

/**
 * 通知者 抽象类
 * @author Administrator
 *
 */
public abstract class Notifier {
	
	private EventHandler eventHandler = new EventHandler();
	
	public EventHandler getEventHandle(){
		return eventHandler;
	}
	
	public void setEventHandle(EventHandler eventHandler){
		this.eventHandler = eventHandler;
	}
	
	/**
	 * 增加需要帮忙放哨的学生
	 * @param obj 要执行方法的对象
	 * @param mothName 执行方法的方法名
	 * @param args 执行方法的参数
	 */
	public abstract void addListenter(Object obj,String mothName,Object... args	);
	
	/**
	 * 告诉所有帮忙放哨的学生：老师来了
	 */
	public abstract void notifyX();
	
}
