package com.objectpool;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ObjectPoolDemo {

	public static void main(String[] args) {

		CounterPool pool = new CounterPool();
		System.out.print(pool.toString());
		
		Counter counter1 = pool.getObject();
		System.out.println(pool.toString());
		
		Counter counter2 = pool.getObject();
		System.out.println(pool.toString());
		
		pool.releaseObject(counter1);
		System.out.println(pool.toString());
		
		pool.releaseObject(counter2);
		System.out.println(pool.toString());
		
		
		
	}

}
