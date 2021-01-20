package es.studium.Pr.Tema5;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class listaColores extends Frame implements WindowListener, ItemListener
{
	private static final long serialVersionUID = 1L;
	//Creamos la lista
	Choice lista = new Choice();
	
	public listaColores() {
	setLayout(new FlowLayout());
	setTitle("Lista Colores");
	lista.add("Blanco");
	lista.add("Rojo");
	lista.add("Azul");
	add(lista);
	
	addWindowListener(this);
	lista.addItemListener(this);
	setSize(300,200);
	setLocationRelativeTo(null);
	setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new listaColores();
	}
	public void windowActivated(WindowEvent arg0){}
	public void windowClosed(WindowEvent arg0){}
	public void windowClosing(WindowEvent arg0)
	{
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent arg0){}
	public void windowDeiconified(WindowEvent arg0){}
	public void windowIconified(WindowEvent arg0){}
	public void windowOpened(WindowEvent arg0){}
	public void itemStateChanged(ItemEvent ie)
	{
		if("Blanco".equals(ie.getItem()))
		{
			setBackground(Color.white);
		}else if("Rojo".equals(ie.getItem())){
			setBackground(Color.red);
		}else {
			setBackground(Color.blue);
		}
	}
}
