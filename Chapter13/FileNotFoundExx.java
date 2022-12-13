// 13-1a 
import java.io.*;
public class FileNotFoundExx {

	public static void main(String[] args) {
		FileReader fin = null;
		try {
			fin = new FileReader("");
			int c;
			while ((c=fin.read())!=-1) // 한 문자씩 파일 끝까지 읽기
				System.out.print((char)c);
			fin.close();
		}
		catch(FileNotFoundException e) { // IOException이 FileNotFoundException의 상위 클래스이므로 FileNotFoundException부터 처리해야 함.
			System.out.println("파일오픈 오류");
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
