package IteratorPattern;

public abstract class Iterator {
	
	public abstract void first();
	public abstract void next();
	public abstract boolean isDone();
	public abstract int currentItem();
}
