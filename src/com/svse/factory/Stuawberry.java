package com.svse.factory;

/**
 * ��ݮ
 * @author Administrator
 *
 */
public class Stuawberry implements Fruit{

	@Override
	public void grow() {
		System.out.println("��ݮ ����");
	}

	@Override
	public void harvest() {
		System.out.println("��ݮ �ջ�");
	}

	@Override
	public void plant() {
		System.out.println("��ݮ ��ֲ");
	}

}
