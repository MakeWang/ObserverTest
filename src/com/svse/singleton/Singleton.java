package com.svse.singleton;

/**
 * ����ʽ����
 * �����Ƚ�����ֻ�е�����getInstance��ʱ�򣬲Ż�ȥ��ʼ�����������
 * �̲߳���ȫ����getInstance�����ϼ�synchronized�����Ű�ȫ
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
