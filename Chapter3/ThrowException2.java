
public class ThrowException2 {

	public static void main(String[] args) {
		f();
		System.out.println("This is main().");
	}
	static void f() {
		Exception ex = new Exception();
		throw ex; // 이 위치에서 예외 발생. catch 하지 았았으므로 호출한 쪽으로 예외를 던짐. 
	} // Exception 클래스는 checked exception이므로 컴파일 오류 발생
}
