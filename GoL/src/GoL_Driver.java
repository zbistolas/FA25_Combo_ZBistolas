import javax.swing.JFrame;

public class GoL_Driver {

	public static void main(String[] args) {
		String title = "Zach's Conways Game Of Life";
		Conway game = new Conway();
		JFrame frame = new JFrame(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.add(game.getGrid());
		frame.pack();
		frame.setVisible(true);
		game.mainloop();
	}

}
