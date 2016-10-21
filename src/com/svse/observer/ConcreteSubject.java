package com.svse.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements ISubject{

	List<IObserver> mList = new ArrayList<IObserver>();
	@Override
	public void addObserver(IObserver mObserver) {
		if(mObserver == null){
			throw new NullPointerException();
		}
		//确保相同的观察只有一个
		if(!mList.contains(mObserver)){
			mList.add(mObserver);
		}
	}

	@Override
	public void removeObserver(IObserver mObserver) {
		mList.remove(mObserver);
	}

	@Override
	public void removeAll() {
		mList.clear();
	}

	@Override
	public void notifyAllObserver(Object data) {
		for (IObserver obs : mList) {
			obs.update(this, data);
		}
	}

	@Override
	public void notify(IObserver mObserver, Object data) {
		if(mObserver != null){
			mObserver.update(this, data);
		}
		
	}
}
