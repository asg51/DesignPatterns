package CompositePattern;

public class Text implements Component{

	private String meaning;
	
	public Text(String meaning) {
		
		this.meaning = meaning;
	}
	
	@Override
	public void operation() {
		
		System.out.println("<p>"+meaning+"</p>");
	}

	@Override
	public void add(Component component) {
		
		return;
	}

	@Override
	public void remove(Component component) {
		
		return;
	}

	@Override
	public Component getChild(int index) {
		
		return null;
	}

}
