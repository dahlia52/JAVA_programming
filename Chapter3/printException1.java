
public class printException1 {

	public static void main(String[] args) {
		try {
			int a = 100/0; // 예외 발생
		}
		catch (ArithmeticException ex) { 
			System.out.println(ex); // 예외 객체의 내용 출력
		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("End of main");
	}
}
