// 13-7 버퍼 스트림을 이용한 출력
import java.io.*;
import java.util.*;

public class BufferedIOEx {

	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("c:\\Temp\\test.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out,8); // 버퍼 생성
			while ((c=fin.read())!=-1)
				out.write(c); // 버퍼가 꽉 찰 때 문자가 화면에 출력
			
			// 파일 데이터가 모두 출력된 상태
			new Scanner(System.in).nextLine(); // <Enter>키를 기다림.
			out.flush(); // 버퍼에 남아있던 문자 모두 출력
			fin.close();
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
