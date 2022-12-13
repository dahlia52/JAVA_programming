// 13-2 InputStreamReader로 한글 텍스트 파일 읽기
import java.io.*;

public class FileReadHangulSuccess {

	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("hangul.txt");
			in = new InputStreamReader(fin, "MS949"); // MS에서 만든 한글 확장 완성형 문자 집합
			int c;
			
			System.out.println("인코딩 문자 집합은 "+in.getEncoding());
			while ((c=in.read())!=-1) {
				System.out.println((char)c);
			}
			in.close();
			fin.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
