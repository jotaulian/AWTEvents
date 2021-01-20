package es.studium.Pr.Tema5;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class BotonOpciones extends Frame implements WindowListener, ItemListener
{

	private static final long serialVersionUID = 1L;
	//En este caso, se pueden elegir todas las opciones que queramos
	Checkbox chkUno = new Checkbox("Uno");
	Checkbox chkDos = new Checkbox("Dos");
	Checkbox chkTres = new Checkbox("Tres");
	Label lblEtiqueta1 = new Label("Desactivado");
	Label lblEtiqueta2 = new Label("Desactivado");
	Label lblEtiqueta3 = new Label("Desactivado");
	
	public BotonOpciones(){
		setLayout(new FlowLayout());
		setTitle("Botones de Opción");
		//Añadir los listeners a los botones de opción
		chkUno.addItemListener(this);
		chkDos.addItemListener(this);
		chkTres.addItemListener(this);
		
		add(chkUno);
		add(lblEtiqueta1);
		add(chkDos);
		add(lblEtiqueta2);
		add(chkTres);
		add(lblEtiqueta3);
		addWindowListener(this);
		setSize(500,100);
		setVisible(true);
		}
	
	
	public static void main(String[] args){
		new checkBoxEvent();
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		if("Uno".equals(ie.getItem()))
		{
			if(ie.getStateChange()==ItemEvent.SELECTED) 
			{
				lblEtiqueta1.setText("Activado");
			}else 
			{
				lblEtiqueta1.setText("Desactivado");
			}
		}
		else if("Dos".equals(ie.getItem()))
		{
			if(ie.getStateChange()==ItemEvent.SELECTED){
				lblEtiqueta2.setText("Activado");
				}
			else
			{
					lblEtiqueta2.setText("Desactivado");
			}
		}
		else if("Tres".equals(ie.getItem()))
		{
			if(ie.getStateChange()==ItemEvent.SELECTED)
			{
				lblEtiqueta3.setText("Activado");
				System.out.println(ie.getStateChange());
			}
			else
			{
					lblEtiqueta3.setText("Desactivado");
			}
		}
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

}
