package CompositePattern;

import java.util.ArrayList;

public class Chapter implements Component{

	private String title;
	private ArrayList<Component> components;
	
	public Chapter(String title) {
		
		this.title = title;
		components = new ArrayList<Component>();
	}
	
	@Override
	public void operation() {
		
		System.out.println("<b>"+title+"</b>");
		for (Component component : this.components) {
			component.operation();
		}
	}

	@Override
	public void add(Component component) {
		
		this.components.add(component);
	}

	@Override
	public void remove(Component component) {
		
		this.components.remove(component);
	}

	@Override
	public Component getChild(int index) {
		
		return this.components.get(index);
	}

}
