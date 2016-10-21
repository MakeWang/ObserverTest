package com.svse.observer;

public class NBAObserver implements IObserver{

	@Override
	public void update(ISubject mSubject, Object data) {
		System.out.println( " 我是"+this.getClass().getSimpleName()+"，  "+data+"别看NBA了");
	}
}
