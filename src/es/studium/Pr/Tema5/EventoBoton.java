package es.studium.Pr.Tema5;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventoBoton implements ActionListener, WindowListener //implements ActionListen
{

	Frame ventana = new Frame("Eventos");
	Button btnAceptar = new Button("Aceptar");
	Button btnCancelar = new Button("Cancelar");
	Button btnDestruir = new Button("Destruir");
	Button btnSalir = new Button("Salir");
	
	public EventoBoton() {
		ventana.setLayout(new FlowLayout());
		ventana.setSize(230,200);
		ventana.setResizable(false);
		ventana.addWindowListener(this);
		btnAceptar.addActionListener(this); //Le ponemos las orejas al boton
		ventana.add(btnAceptar);
		btnCancelar.addActionListener(this);
		ventana.add(btnCancelar);
		btnDestruir.addActionListener(this);
		ventana.add(btnDestruir);
		btnSalir.addActionListener(this);
		ventana.add(btnSalir);
		ventana.setLocationRelativeTo(null);		
		ventana.setVisible(true);
	}
	public static void main(String[] args)
	{
		new EventoBoton();
	}
	
	//Este metodo sera necesario siempre que trabajemos con eventos y Botones.
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(btnAceptar)) {
			System.out.println("Pulsate el boton ACEPTAR...");
		} 
		else if(e.getSource().equals(btnDestruir)) {
			System.out.println("Pulsate el boton DESTRUIR...");
		} 
		else if(e.getSource().equals(btnCancelar)) {
			System.out.println("Pulsaste el boton CANCELAR");
		}
		else if(e.getSource().equals(btnSalir)) {
			System.out.println("Hasta luego !");
			System.exit(0);
		}
	}
	
	@Override
	public void windowActivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent arg0)
	{
		System.exit(0);
	}
	@Override
	public void windowDeactivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0)
	{
		System.out.println("Me han restaurado");
	}
	@Override
	public void windowIconified(WindowEvent arg0)
	{
		System.out.println("Me han minimizado");
	}
	@Override
	public void windowOpened(WindowEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}

}
