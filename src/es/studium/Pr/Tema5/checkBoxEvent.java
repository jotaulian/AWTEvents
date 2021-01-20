package es.studium.Pr.Tema5;


import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class checkBoxEvent extends Frame implements WindowListener, ItemListener
{

	private static final long serialVersionUID = 1L;
	CheckboxGroup grupo = new CheckboxGroup();
	//En este caso, se pueden elegir todas las opciones que queramos
	Checkbox chkUno = new Checkbox("Uno",true,grupo);
	Checkbox chkDos = new Checkbox("Dos",false,grupo);
	Checkbox chkTres = new Checkbox("Tres",false,grupo);
	Label lblEtiqueta1 = new Label("Activado");
	Label lblEtiqueta2 = new Label("Desactivado");
	Label lblEtiqueta3 = new Label("Desactivado");
	
	public checkBoxEvent(){
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
				lblEtiqueta1.setText("Activado");
				lblEtiqueta2.setText("Desactivado");
				lblEtiqueta3.setText("Desactivado");
		}
		else if("Dos".equals(ie.getItem()))
		{
				lblEtiqueta1.setText("Desactivado");
				lblEtiqueta2.setText("Activado");
				lblEtiqueta3.setText("Desactivado");
		}
		else if("Tres".equals(ie.getItem()))
		{
				lblEtiqueta1.setText("Desactivado");
				lblEtiqueta2.setText("Desactivado");
				lblEtiqueta3.setText("Activado");
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

