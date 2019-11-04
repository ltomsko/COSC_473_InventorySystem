import javax.swing.JFrame;

public class Admin {

	public static void main(String[] args) {
	}

	public AdminLandingPage Window() {

		AdminLandingPage window = new AdminLandingPage();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400, 380);
		window.setVisible(true);
		return window;

	}

}
