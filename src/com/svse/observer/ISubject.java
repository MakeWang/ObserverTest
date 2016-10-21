package com.svse.observer;

/**
 * 被观察者接口
 * @author Administrator
 *
 */
public interface ISubject {
	
	/**
	 * 添加观察者
	 * @param mObserver
	 */
	void addObserver(IObserver mObserver);
	
	/**
	 * 移除某一个观察者
	 * @param mObserver
	 */
	void removeObserver(IObserver mObserver);
	
	/**
	 * 移除所有观察者
	 */
	void removeAll();
	
	
	/**
	 * data 通知给观察者的数据
	 * @param data
	 */
	void notifyAllObserver(Object data);
	
	
	/**
	 * data 通知某一个观察着的数据
	 * @param mObserver
	 * @param data
	 */
	void notify(IObserver mObserver,Object data);
}
