// 4-3
public class Circled {
	int radius;
	String name;
	
	public Circled() {
		radius = 1; name="";
	}
	public Circled(int r, String n) {
		radius = r; name=n;
	}
	public double getArea() {
		return 3.14 * radius * radius;
	}

	public static void main(String[] args) {
		Circled pizza = new Circled(10, "자바피자");
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circled donut = new Circled();
		donut.name = "도넛피자";
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);
	}
}
