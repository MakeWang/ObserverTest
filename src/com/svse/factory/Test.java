package com.svse.factory;
/**
 * ����ģʽ
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		FruitGardener fg = new FruitGardener();
		Fruit fruit1 = fg.factory("apple");
		fruit1.grow();
		//Fruit fruit2=fg.factory("stuawberry");
		//fruit2.plant();
	}
}
