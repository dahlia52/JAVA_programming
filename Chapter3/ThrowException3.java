
public class ThrowException3 {

	public static void main(String[] args) {
		f(); // 이 위치에서 예외 발생
		System.out.println("This is main().");
	}
	static void f() throws Exception{
		Exception ex = new Exception();
		ThrowException3 ex;
	}

}
