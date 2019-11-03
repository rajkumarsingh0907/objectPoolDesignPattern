package com.objectpool;


public class Counter {
	private static int count = 1;

	  private final int id;

	  public Counter() {
	    id = count++;
	  }

	  public int getId() {
	    return id;
	  }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Counter [id=").append(id).append("]");
		return builder.toString();
	}

	  
}
