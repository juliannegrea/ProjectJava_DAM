package traductor;

import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Panel extends JPanel{
	
	JLabel textoTraducir= new JLabel("Texto para traducir");		
	JLabel textoTraducido= new JLabel("Texto traducido");	
	JTextField palabraIn= new JTextField(); 
	JTextField palabraOut= new JTextField(); 
	JButton traducir=new JButton("TRADUCIR");
	
	
	public Panel() {
		
		//super.paintComponent(g);
		setLayout(null);
		textoTraducir.setBounds(50, 49, 124, 14);				
		palabraIn.setBounds(200, 49, 124, 28);
		
		traducir.setBounds(150, 140, 117, 50);
		traducir.setToolTipText("PULSA PARA TRADUCIR");
		traducir.addActionListener(new EventoTraducir(palabraIn, palabraOut));
		
		textoTraducido.setBounds(50, 250, 117, 14);
		palabraOut.setBounds(200, 250, 124, 28);
		palabraOut.setEditable(false);
		
		add(textoTraducido);
		add(textoTraducir);
		add(palabraIn);
		add(palabraOut);
		add(traducir);
	}
}
