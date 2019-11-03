package com.objectpool;

import java.util.HashSet;
import java.util.Set;

public abstract class ObjectPool<T> {

	private Set<T> available = new HashSet<>();
	private Set<T> inUse = new HashSet<>();

	protected abstract T create();

	public synchronized T getObject() {
		if (available.isEmpty()) {
			available.add(create());
		}

		T instance = available.iterator().next();
		available.remove(instance);
		inUse.add(instance);
		return instance;
	}

	public synchronized void releaseObject(T instance) {
		inUse.remove(instance);
		available.add(instance);
	}

	@Override
	public synchronized String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ObjectPool [available=").append(available).append(", inUse=").append(inUse).append("]");
		return builder.toString();
	}

}
