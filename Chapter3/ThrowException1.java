
public class ThrowException1 {

	public static void main(String[] args) {
		f();
		System.out.println("This is main().");
	}
	static void f() {
		Exception ex;
		ex = new Exception();
		ex.printStackTrace();
		
		ex = new Exception("test exception"); // 예외 객체의 메시지
		ex.printStackTrace();
		
		ex = new ArithmeticException();
		ex.printStackTrace();
		
		ex = new ArithmeticException("+-*/");
		ex.printStackTrace();
	}

}
