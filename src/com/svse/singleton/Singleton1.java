package com.svse.singleton;

import java.util.Collections;
import java.util.HashMap;

/**
 * ����ʽ����
 * ����������һ�����أ��Ͱѵ�����ʼ����ɡ�
 * ��֤getInstance��ʱ�򣬵������Ѿ����ڵ��ˣ��������̰߳�ȫ
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
