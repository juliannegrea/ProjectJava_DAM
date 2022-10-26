package traductor;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaTraductor nueva= new VentanaTraductor();
					nueva.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					nueva.setVisible(true);
				}
					catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
	}
}
