// 13-6 10개의 정수를 파일에 저장하기
import java.io.*;

public class FileWriterTest {

	public static void main(String[] args) {
		
		try {
			FileWriter fout = new FileWriter("test.txt");
			for (int i=0; i<10; i++)
				fout.write('0'+i); // 유니코드 변환을 위해 '0'을 붙임
			fout.close();
		}
		catch(IOException e) {
			System.out.println("IO error");
		}
	}
}
