package interfaz;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import eventos.HandleTextChat;

public class Ventana extends JFrame{
	
	uPanel elPanel = new uPanel();
	JLabel logo = new JLabel("Letter BOX");
	JTextArea elChat = new JTextArea("Iniciando chat..\n>>");
	JTextField entrada = new JTextField("_");
	
	HandleTextChat htc = new HandleTextChat();
	
	
	
	public Ventana(){
		
		elPanel.setLayout(null);
		
		setTitle("Letter BOX - by DaJu");
		setSize(320,480);
		
		//ubicar logo
		logo.setFont(new Font("verdana", Font.BOLD, 14));
		logo.setBounds(105, 10, 250, 25);
		
		//ubicamos el chat
		elChat.setBounds(7, 50, 290, 340);
		elChat.setBackground(new Color(33,33,33));
		elChat.setForeground(Color.white);
		
		//configuramos el entrada
		entrada.setBounds(7,395,290,40);
		entrada.setFont(new Font("verdana", Font.CENTER_BASELINE, 13));
		
		//agregar al panel
		elPanel.add(logo);
		elPanel.add(elChat);
		elPanel.add(entrada);
		
		entrada.addKeyListener(htc);
		
		this.add(elPanel);
		
	}
	

}
