// 4-10
class Sample{
	public int a;
	private int b;
	int c;
}
public class AccessEx {

	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10;
		// aClass.b = 10; private이므로 접근 불가
		aClass.c = 10;
	}

}
