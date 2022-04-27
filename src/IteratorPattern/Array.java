package IteratorPattern;

import java.util.ArrayList;

public class Array extends Aggregate {

	public ArrayList<Integer> list;
	
	public Array()
	{
		list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
	}
	
	@Override
	public Iterator createIterator() {
		
		return new ArrayIterator(this);
	}

}
