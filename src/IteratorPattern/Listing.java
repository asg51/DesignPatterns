package IteratorPattern;

public class Listing {

	public static void list(Aggregate aggregate) {
		
		Iterator iterator = aggregate.createIterator();
		
		for(iterator.first(); !iterator.isDone(); iterator.next()) {
			
			System.out.println(iterator.currentItem());
		}
	}
}
