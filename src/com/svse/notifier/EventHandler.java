package com.svse.notifier;

import java.util.ArrayList;
import java.util.List;

/**
 * �¼��Ĵ�����
 * @author Administrator
 *
 */
public class EventHandler {
	
	private List<Event> objects;
	
	public EventHandler(){
		objects = new ArrayList<Event>();
	}
	
	//���ĳ������ִ�е��¼�������Ҫ����
	public void addEvent(Object obj,String methName,Object...args){
		objects.add(new Event(obj,methName,args));
	}
	
	//֪ͨ���еĶ���ִ��ָ���¼�
	public void notityX() throws Exception{
		for (Event e : objects) {
			e.invoke();
		}
	}
	
}
