package com.svse.singleton;

import java.util.Collections;
import java.util.HashMap;

/**
 * 饿汉式单例
 * 饿汉就是类一旦加载，就把单例初始化完成。
 * 保证getInstance的时候，单例是已经存在的了，天生就线程安全
 * @author Administrator
 *
 */

public class Singleton1 {
	
	private Singleton1(){
	}
	private static Singleton1 singleton =  new Singleton1();
	public static Singleton1 getInstance(){
		return singleton;
	}
	
}
