// 9-5 MouseAdapter로 마우시 리스너 작성 - 추상메서드를 모두 구현하지 않아도 됨. 
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseAdapterEx extends JFrame {
	private JLabel la = new JLabel("Hello");
	public MouseAdapterEx() {
		setTitle("Mouse 어댑터 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.addMouseListener(new MyMouseListener());
		c.setLayout(null);
		
		la.setSize(50,20);
		la.setLocation(30,30);
		c.add(la);
		
		setSize(200,200);
		setVisible(true);
	}
	class MyMouseListener extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
		}
	}

	public static void main(String[] args) {
		new MouseAdapterEx();
	}

}
