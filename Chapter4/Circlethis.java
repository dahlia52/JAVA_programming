// 객체 속에서의 this
public class Circlethis {
	int radius;
	public Circlethis(int radius) {
		this.radius = radius;
	}
	public void set(int radius) {
		this.radius = radius;
	}

	public static void main(String[] args) {
		Circlethis ob1 = new Circlethis(1);
		Circlethis ob2 = new Circlethis(2);
		Circlethis ob3 = new Circlethis(3);
		
		System.out.println(ob1.radius + ", " + ob2.radius + ", "+ ob3.radius);
		
		ob1.set(4);
		ob2.set(5);
		ob3.set(6);
		
		System.out.println(ob1.radius + ", " + ob2.radius + ", "+ ob3.radius);

	}

}
