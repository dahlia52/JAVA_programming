// 3-14 0으로 나누기 예외 발생으로 프로그램이 강제 종료되는 경우
import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int divided; // 나뉨수
		int divisor; // 나눗수
		
		System.out.print("나뉨수를 입력하시오:");
		divided = scanner.nextInt();
		System.out.print("나눗수를 입력하시오:");
		divisor = scanner.nextInt();
		
		System.out.println(divided+"를 "+divisor+"로 나누면 몫은 "+divided/divisor + "입니다.");
		scanner.close();
	}
}
