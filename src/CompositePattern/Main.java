package CompositePattern;

public class Main {

	public static void main(String[] args) {
		
		Chapter chapter = new Chapter("Programlamaya Giri�");
		Chapter c1 = new Chapter("Giri�");
		c1.add(new Text("hello, world"));
		c1.add(new Text("di�er programlar"));
		
		Chapter c12 = new Chapter("Temel Programlama");
		c12.add(new Text("de�i�kenler"));
		c12.add(new Text("kontrol"));
		c12.add(new Text("d�ng�ler"));
		c12.add(new Text("fonksiyonlar"));
		
		c1.add(c12);
		
		Chapter c2 = new Chapter("De�i�kenler");
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
