// 6-2
class Point1{
	private int x, y;
	public Point1(int x, int y) {
		this.x = x; this.y = y;
	}
	public String toString() {
		return "Point("+x+","+y+")"; // 오버라이딩
	}
}
public class toStringEx {

	public static void main(String[] args) {
		Point1 p = new Point1(2,3);
		System.out.println(p.toString());
		System.out.println(p); // p.toString()으로 자동변환
		System.out.println(p+"입니다.");
	}

}
