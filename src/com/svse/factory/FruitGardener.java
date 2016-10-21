package com.svse.factory;
/**
 * Å©³¡Ô°¶¡
 * @author Administrator
 *
 */
public class FruitGardener {
	public static Fruit factory(String type){
		if(type.equalsIgnoreCase("apple")){
			return new Apple();
		}else if(type.equalsIgnoreCase("stuawberry")){
			return new Stuawberry();
		}else if(type.equalsIgnoreCase("grape")){
			return new Grape();
		}else{
			throw new NullPointerException();
		}
	}
}