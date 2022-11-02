// 3-14
import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int divided; int divisor;
		System.out.print("나뉨수를 입력하시오:");
		divided = scanner.nextInt();
		System.out.print("나눗수를 입력하시오:");
		divisor = scanner.nextInt();
		System.out.println(divided+"를 " + divisor + "로 나눔ㄴ 몫은 " + divided/divisor + "입니다.");
		scanner.close();
	}

}
