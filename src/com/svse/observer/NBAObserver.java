package com.svse.observer;

public class NBAObserver implements IObserver{

	@Override
	public void update(ISubject mSubject, Object data) {
		System.out.println( " ����"+this.getClass().getSimpleName()+"��  "+data+"��NBA��");
	}
}
