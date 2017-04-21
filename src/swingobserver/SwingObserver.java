package swingobserver;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserver {

	JFrame jFrame;
	
	public static void main(String[] args) {
		SwingObserver example = new SwingObserver();
		example.go();
	}

	public void go()
	{
		jFrame = new JFrame();
		JButton jButton = new JButton("정말 해도 될까?");
		jButton.addActionListener(new AngleListener());
		jButton.addActionListener(new DevilListener());
		jFrame.getContentPane().add(BorderLayout.CENTER, jButton);
		jFrame.setSize(200,200);
		jFrame.setVisible(true);
		
	}
	
	class AngleListener implements ActionListener{
	
		@Override
		public void actionPerformed(ActionEvent e) {	
			System.out.println("안돼. 분명 나중에 후회할 꺼야");
		}
	}

	class DevilListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("당연하지. 저질러버려");	
		}
	}
}

