import java.awt.*;
import javax.swing.*;

public class Numbers extends JFrame {
	public Numbers() {
		setTitle("번호판 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new GridLayout(4,3,5,5));
		
		for (int i=1; i<=9; i++) {
			c.add(new JButton(Integer.toString(i)));
		}
		c.add(new JButton("*"));
		c.add(new JButton("0"));
		
		setSize(400,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Numbers();
	}

}
