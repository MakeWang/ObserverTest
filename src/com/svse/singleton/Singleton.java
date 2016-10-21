package com.svse.singleton;

/**
 * 懒汉式单例
 * 懒汉比较懒，只有当调用getInstance的时候，才回去初始化这个单例。
 * 线程不安全，在getInstance方法上加synchronized加锁才安全
 * @author Administrator
 *
 */

public class Singleton {
	
	private Singleton(){
		
	}
	
	private static Singleton singleton = null;
	
	public synchronized static Singleton getInstance(){
		if(singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}
	
}
