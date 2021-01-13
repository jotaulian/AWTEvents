package es.studium.Pr.Tema5;

import java.awt.Canvas;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EjemploCanvas implements WindowListener, KeyListener
{
	Frame ventana = new Frame("Canvas");
	Canvas lienzo = new Canvas();
	
	public EjemploCanvas() {
		ventana.setLayout(new FlowLayout());
		ventana.setSize(500,180);
		ventana.add(lienzo);
		lienzo.requestFocus();
		ventana.addKeyListener(this);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.addWindowListener(this);
		ventana.setVisible(true);
	}
	public static void main(String[] args)
	{
		new EjemploCanvas();
	}

	@Override
	public void windowActivated(WindowEvent arg0){}

	@Override
	public void windowClosed(WindowEvent arg0){}

	@Override
	public void windowClosing(WindowEvent arg0){
		System.out.println("Usted cerro la ventana...");
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0){}

	@Override
	public void windowDeiconified(WindowEvent arg0){}

	@Override
	public void windowIconified(WindowEvent arg0){}

	@Override
	public void windowOpened(WindowEvent arg0){}
	@Override
	public void keyPressed(KeyEvent e)
	{
		System.out.println(e.getKeyCode());
		if(e.getKeyCode()==27) {
			System.exit(0);
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0)
	{
	}
	@Override
	public void keyTyped(KeyEvent arg0)
	{
	}
}
