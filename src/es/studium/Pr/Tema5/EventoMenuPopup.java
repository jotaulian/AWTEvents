package es.studium.Pr.Tema5;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventoMenuPopup extends Frame implements ActionListener, WindowListener
{
	private static final long serialVersionUID = 1L;
	Button btnBoton = new Button("P�lsame...");
	//Creamos el men� popup
	PopupMenu ppMenu = new PopupMenu("Popup");
	//Creamos opciones del men�
	MenuItem mnUno = new MenuItem("Rojo");
	MenuItem mnDos = new MenuItem("Blanco");
	
	public EventoMenuPopup(){
		setLayout(new FlowLayout());
		setTitle("Men� Pop-up");
		//A�adimos el bot�n
		add(btnBoton);
		//A�adimos las opciones al men�
		ppMenu.add(mnUno);
		ppMenu.add(mnDos);
		//A�adimos el men�
		add(ppMenu);
		
		//A�adimos listeners
		btnBoton.addActionListener(this);
		mnUno.addActionListener(this);
		mnDos.addActionListener(this);
		addWindowListener(this);
		
		setSize(250,100);setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new EventoMenuPopup();
	}
	
	public void actionPerformed(ActionEvent ae) {
		Object a;
		a = ae.getSource();
		if(a.equals(btnBoton)) {
			//Se mostrar� el popup a una distancia de 40 en horizontal y 10 en vertical respecto al objeto btnBoton.
			ppMenu.show(btnBoton,40,10);
		}else if(a.equals(mnUno)) {
			setBackground(Color.red);
		}else {
			setBackground(Color.white);
		}
	}
	public void windowActivated(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
	public void windowClosing(WindowEvent we){System.exit(0);}
	public void windowDeactivated(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowOpened(WindowEvent we) {}
}
