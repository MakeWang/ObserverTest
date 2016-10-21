package com.svse.factory;

/**
 * 葡萄
 * @author Administrator
 *
 */
public class Grape implements Fruit{

	private boolean seedless;
	
	@Override
	public void grow() {
		System.out.println("葡萄 生长");
	}

	@Override
	public void harvest() {
		System.out.println("葡萄 收获");
	}

	@Override
	public void plant() {
		System.out.println("葡萄 种植");
	}

	public static void log(String msg){
		System.out.println("葡萄消息："+msg);
	}

	public boolean isSeedless() {
		return seedless;
	}

	public void setSeedless(boolean seedless) {
		this.seedless = seedless;
	}
	

}
