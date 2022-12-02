// 9-6 KeyListener 활용 - 입력된 문자 키 판별
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class KeyCharEx extends JFrame {
	private JLabel la = new JLabel("<Enter>키로 배경색이 바뀝니다");
	
	public KeyCharEx() {
		super("KeyListener의 문자 키 입력 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		c.addKeyListener(new MyKeyListener());
		
		setSize(250,150);
		setVisible(true);
		
		c.setFocusable(true); // 컨텐트팬이 포커스를 받을 수 있도록 설정
		c.requestFocus(); // 컨텐트팬에 포커스 설정
	}
	class MyKeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int r = (int)(Math.random() * 256);
			int g = (int)(Math.random() * 256);
			int b = (int)(Math.random() * 256);
			
			switch(e.getKeyChar()) {
				case '\n':
					la.setText("r=" + r + ", g="+ g + ", b=" + b);
					getContentPane().setBackground(new Color(r,g,b));
					break;
				case 'q':
					System.exit(0);
			}
		}
	}

	public static void main(String[] args) {
		new KeyCharEx();
	}
}
