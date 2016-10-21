package com.svse.factory;

/**
 * ����
 * @author Administrator
 *
 */
public class Grape implements Fruit{

	private boolean seedless;
	
	@Override
	public void grow() {
		System.out.println("���� ����");
	}

	@Override
	public void harvest() {
		System.out.println("���� �ջ�");
	}

	@Override
	public void plant() {
		System.out.println("���� ��ֲ");
	}

	public static void log(String msg){
		System.out.println("������Ϣ��"+msg);
	}

	public boolean isSeedless() {
		return seedless;
	}

	public void setSeedless(boolean seedless) {
		this.seedless = seedless;
	}
	

}
