// getStackTrace() 호출
public class PrintException4 {

	public static void main(String[] args) {
		f();
	}
	static void f() {
		g();
	}
	static void g() {
		h();
	}
	static void h() {
		try {
			int a = 100/0;
		}
		catch (ArithmeticException ex) {
			StackTraceElement [] arr;
			
		}
	}
}
