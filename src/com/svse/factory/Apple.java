package com.svse.factory;

/**
 * ƻ��
 * @author Administrator
 *
 */
public class Apple implements Fruit{

	private int treeAge;//ƻ����������
	
	@Override
	public void grow() {
		System.out.println("ƻ�� ����");
	}

	@Override
	public void harvest() {
		System.out.println("ƻ�� �ջ�");
	}

	@Override
	public void plant() {
		System.out.println("ƻ�� ��ֲ");
	}
	
	public static void log(String msg){
		System.out.println("ƻ����Ϣ��"+msg);
	}

	public int getTreeAge() {
		return treeAge;
	}

	public void setTreeAge(int treeAge) {
		this.treeAge = treeAge;
	}

}
