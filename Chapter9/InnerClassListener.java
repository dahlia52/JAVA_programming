// 9-2 내부 클래스로 Action 이벤트 리스너 만들기
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class InnerClassListener extends JFrame{
	public InnerClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		
		c.add(btn);
		setSize(250,120);
		setVisible(true);
	}
	private class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			
			if (b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			//InnerClassListener의 멤버나 JFrame의 멤버를 호출
			InnerClassListener.this.setTitle(b.getText()); // 타이틀에 버튼 문자열을 출력
		}
	}

	public static void main(String[] args) {
		new InnerClassListener();
	}
}
