package IteratorPattern;

public class ArrayIterator extends Iterator {

	private Array array;
	private int id;
	
	public ArrayIterator(Array array) {
		
		this.array = array;
		this.id = 0;
	}
	
	@Override
	public void first() {
		
		this.id = 0;
	}

	@Override
	public void next() {
		
		this.id++;
	}

	@Override
	public boolean isDone() {
		
		return this.id == array.list.size();
	}

	@Override
	public int currentItem() {
		
		return this.array.list.get(this.id);
	}

}
