// 13-1 FileREader로 텍스트 파일 읽기
import java.io.*;
	
public class FileReaderEx {

	public static void main(String[] args) {
		FileReader fin = null;
		
		try {
			fin = new FileReader("c:\\windows\\system.ini");
			int c;
			while ((c=fin.read())!=-1) {
				System.out.print((char)c);
			}
			fin.close();
		}
		catch (IOException e){ // IOException은 FileNotFoundException의 상위 클래스이므로 IOExeption은 FileNotFoundException과 IOException을 모두 catch함.
			System.out.println("입출력 오류");
		}
	}
}
