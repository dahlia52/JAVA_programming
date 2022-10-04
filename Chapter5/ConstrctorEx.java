// 슈퍼클래스와 서브 클래스의 생성자간의 호출 및 실행 관계
class A{
	public A() {
		System.out.println("생성자A");
	}
}
class B extends A{
	public B() {
		System.out.println("생성자B");
	}
}
class C extends B{
	public C() {
		System.out.println("생성자C");
	}
}
public class ConstrctorEx {

	public static void main(String[] args) {
		C c;
		c = new C();
	}
}
