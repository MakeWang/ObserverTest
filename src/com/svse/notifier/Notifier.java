package com.svse.notifier;

/**
 * ֪ͨ�� ������
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
	 * ������Ҫ��æ���ڵ�ѧ��
	 * @param obj Ҫִ�з����Ķ���
	 * @param mothName ִ�з����ķ�����
	 * @param args ִ�з����Ĳ���
	 */
	public abstract void addListenter(Object obj,String mothName,Object... args	);
	
	/**
	 * �������а�æ���ڵ�ѧ������ʦ����
	 */
	public abstract void notifyX();
	
}
