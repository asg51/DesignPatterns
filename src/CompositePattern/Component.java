package CompositePattern;

public interface Component {
	
	void operation();
	void add(Component component);
	void remove(Component component);
	Component getChild(int index);
}
