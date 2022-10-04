// 5-3
class Points{
	private int x, y;
	public Points() {
		this.x = 0; this.y = 0;
	}
	public Points(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoints() {
		System.out.println("("+x+"."+y+")");
	}
}
class ColorPoints extends Points{
	private String color;
	public ColorPoints(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	public void showColorPoints() {
		System.out.print(color);
		showPoints();
	}
}
public class SuperEx {

	public static void main(String[] args) {
		ColorPoints cp = new ColorPoints(5,6,"blue");
		cp.showColorPoints();
	}
}
