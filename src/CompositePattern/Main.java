package CompositePattern;

public class Main {

	public static void main(String[] args) {
		
		Chapter chapter = new Chapter("Programlamaya Giriþ");
		Chapter c1 = new Chapter("Giriþ");
		c1.add(new Text("hello, world"));
		c1.add(new Text("diðer programlar"));
		
		Chapter c12 = new Chapter("Temel Programlama");
		c12.add(new Text("deðiþkenler"));
		c12.add(new Text("kontrol"));
		c12.add(new Text("döngüler"));
		c12.add(new Text("fonksiyonlar"));
		
		c1.add(c12);
		
		Chapter c2 = new Chapter("Deðiþkenler");
		c2.add(new Image("degiskenler.jpg"));
		c2.add(new Text("int, double, float, boolean"));
		
		chapter.add(c1);
		chapter.add(c2);
		
		print(chapter);
		System.out.println();
		print(c12);
		
	}
	
	public static void print(Chapter chapter) {
		
		chapter.operation();
	}
}
