package com.svse.observer;

/**
 * ���۲��߽ӿ�
 * @author Administrator
 *
 */
public interface ISubject {
	
	/**
	 * ��ӹ۲���
	 * @param mObserver
	 */
	void addObserver(IObserver mObserver);
	
	/**
	 * �Ƴ�ĳһ���۲���
	 * @param mObserver
	 */
	void removeObserver(IObserver mObserver);
	
	/**
	 * �Ƴ����й۲���
	 */
	void removeAll();
	
	
	/**
	 * data ֪ͨ���۲��ߵ�����
	 * @param data
	 */
	void notifyAllObserver(Object data);
	
	
	/**
	 * data ֪ͨĳһ���۲��ŵ�����
	 * @param mObserver
	 * @param data
	 */
	void notify(IObserver mObserver,Object data);
}
