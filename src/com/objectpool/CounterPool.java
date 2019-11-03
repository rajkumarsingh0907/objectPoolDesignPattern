package com.objectpool;


public class CounterPool extends ObjectPool<Counter> {

	@Override
	protected Counter create() {
		return new Counter();
	}
	
	

}
