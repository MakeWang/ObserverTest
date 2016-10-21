package com.svse.notifier;

import java.util.ArrayList;
import java.util.List;

/**
 * 事件的处理者
 * @author Administrator
 *
 */
public class EventHandler {
	
	private List<Event> objects;
	
	public EventHandler(){
		objects = new ArrayList<Event>();
	}
	
	//添加某个对象执行的事件，及需要参数
	public void addEvent(Object obj,String methName,Object...args){
		objects.add(new Event(obj,methName,args));
	}
	
	//通知所有的对象执行指定事件
	public void notityX() throws Exception{
		for (Event e : objects) {
			e.invoke();
		}
	}
	
}
