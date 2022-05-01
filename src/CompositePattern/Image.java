package CompositePattern;

public class Image implements Component{

	private String imagePath;
	
	public Image(String imagePath) {
		
		this.imagePath = imagePath;
	}
	
	@Override
	public void operation() {
		
		System.out.println("<img src='"+imagePath+"'/>");
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
