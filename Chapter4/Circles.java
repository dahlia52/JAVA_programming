// 객체의 치환
public class Circles {
	int radius;
	public Circles(int radius) {
		this.radius = radius;
	}
	public void set(int radius) {
		this.radius = radius;
	}

	public static void main(String[] args) {
		Circles ob1 = new Circles(1);
		Circles ob2 = new Circles(2);
		
		Circles s; 
		s = ob1;
		ob1 = ob2;
		System.out.println("ob1.radius = "+ob1.radius);
		System.out.println("ob2.radius = "+ob2.radius);
		System.out.println("s.raidus = "+s.radius);

	}

}
