// Formatter을 이용한 파일 쓰기
import java.util.Formatter;
import java.io.FileNotFoundException;

public class FormatterTest {

	public static void main(String[] args) {
		try {
			Formatter output = new Formatter("numbers.txt");
			for (int i=0; i<10; i++)
				output.format("%d\n", i);
			output.close();
		}
		catch(FileNotFoundException e) {
			System.err.println("cannot open");
			System.exit(1);
		}
	}
}
