package newGame;

import javax.swing.JFrame;

public class BrickBreaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame obj = new JFrame();
		
		GamePlay gamePlay = new GamePlay();
		
		obj.setLocationRelativeTo(null);
		
		obj.setBounds(10,10,700,600);
		
		obj.setTitle("Breakout");
		
		obj.setResizable(false);
		
		obj.setVisible(true);
		
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		
		obj.add(gamePlay);

	}

}
