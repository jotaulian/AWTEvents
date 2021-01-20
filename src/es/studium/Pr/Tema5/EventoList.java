package es.studium.Pr.Tema5;
//Cuidado que hay que dar doble click!!!!!!!!!!!!!!!!!!
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventoList extends Frame implements WindowListener, ActionListener
{
	private static final long serialVersionUID = 1L;
	//Creación de una lista con 4 elementos visibles y que no 
	//permite multiselección
	List lista = new List ( 4, false );
	
	public EventoList(){
		setLayout(new FlowLayout());
		setTitle("Lista con colores");
		lista.add("Blanco");
		lista.add("Rojo");
		lista.add("Azul");
		lista.add("Verde");
		lista.add("Amarillo");
		lista.add("Naranja");
		
		add(lista);
		addWindowListener(this);
		//Para implementar el doble clic del ratón
		//Si sólo quisiéramos una pulsación, lista.addItemListener
		lista.addActionListener(this);
		setSize(250, 200);
		setVisible(true);
		}
	
	public static void main(String[] args)
	{
		new EventoList();
	}
	public void actionPerformed(ActionEvent ae)
	{
		if("Rojo".equals(lista.getSelectedItem()))
		{
			setBackground(Color.red);
		}else if("Azul".equals(lista.getSelectedItem()))
			{
				setBackground(Color.blue);
			}
			else if("Verde".equals(lista.getSelectedItem()))
			{
				setBackground(Color.green);
			}
			else if("Amarillo".equals(lista.getSelectedItem()))
			{
				setBackground(Color.yellow);
			}
			else if("Naranja".equals(lista.getSelectedItem()))
			{
				setBackground(Color.orange);
			}
			else{
				setBackground(Color.white);
				}
	}
	public void windowActivated(WindowEvent arg0) {}
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
