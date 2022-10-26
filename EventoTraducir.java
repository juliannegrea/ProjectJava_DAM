package traductor;

import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class EventoTraducir extends AbstractAction {

	JTextField palabraIn, palabraOut;
	
	public EventoTraducir(JTextField palabraIn, JTextField palabraOut) {
		this.palabraIn=palabraIn;
		this.palabraOut=palabraOut;
	}

	@Override
	public void actionPerformed(ActionEvent e) {		 	
		if(palabraIn.getText().isEmpty()!=true ) {
			palabraOut.setText(traducirWeb(palabraIn.getText()));
		}else {
			
			JOptionPane.showMessageDialog(null, "No ha introducido una palabra", "Error", 0);
		}
		
	}

	private String traducirWeb(String palabra) {
		String cadena=null;
		
		 Document document = null;            
			String webPage = "https://www.spanishdict.com/traductor/"+palabra; 
			try {
				document = Jsoup.connect(webPage).get();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	        Elements palabra2 = document.getElementById("quickdef1-es").getElementsByClass("_1btShz4h");
	        cadena=palabra2.html().toUpperCase();
		return cadena;
	}
	
	
	

}
