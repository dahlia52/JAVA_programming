class StaticSample{
	public int n;
	public void g() {
		m = 20;
	}
	public void h() {
		m = 30;
	}
	public static int m;
	public static void f() {
		m = 5;
	}
}
public class Ex {

	public static void main(String[] args) {
		StaticSample s1, s2;
		s1 = new StaticSample();
		s1.n = 5;
		s1.g();
		System.out.println(s1.m);
		s1.m = 50;
		System.out.println(s1.m);
		
		s2 = new StaticSample();
		s1.n = 8;
		System.out.println(s2.m);
		s2.h();
		System.out.println(s2.m);
		s2.f();
		System.out.println(s2.m);
		System.out.println(s1.m);
	}

}
