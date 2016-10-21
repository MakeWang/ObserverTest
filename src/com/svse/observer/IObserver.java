package com.svse.observer;

/**
 * 观察者接口
 * @author Administrator
 *
 */
public interface IObserver {
	
	/**
	 * 被观察者
	 * 被观察者传递给观察者的数据
	 * @param mSubject
	 * @param data
	 */
	void update(ISubject mSubject,Object data);
	
}
