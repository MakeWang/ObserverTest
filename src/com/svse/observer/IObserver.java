package com.svse.observer;

/**
 * �۲��߽ӿ�
 * @author Administrator
 *
 */
public interface IObserver {
	
	/**
	 * ���۲���
	 * ���۲��ߴ��ݸ��۲��ߵ�����
	 * @param mSubject
	 * @param data
	 */
	void update(ISubject mSubject,Object data);
	
}
