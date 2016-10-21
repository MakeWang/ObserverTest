package com.svse.factory;

/**
 * 苹果
 * @author Administrator
 *
 */
public class Apple implements Fruit{

	private int treeAge;//苹果树的年龄
	
	@Override
	public void grow() {
		System.out.println("苹果 生长");
	}

	@Override
	public void harvest() {
		System.out.println("苹果 收获");
	}

	@Override
	public void plant() {
		System.out.println("苹果 种植");
	}
	
	public static void log(String msg){
		System.out.println("苹果消息："+msg);
	}

	public int getTreeAge() {
		return treeAge;
	}

	public void setTreeAge(int treeAge) {
		this.treeAge = treeAge;
	}

}
