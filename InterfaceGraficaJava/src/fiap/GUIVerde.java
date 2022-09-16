package fiap;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIVerde extends JPanel{
	private JButton btnVerde;
	
	public GUIVerde() {
		inicializarComponentes();
		definirEventos();
	}
	
	public void inicializarComponentes() {
		btnVerde = new JButton("Verde");
		btnVerde.setBounds(50, 20, 140, 40);
		
		add(btnVerde);
	}
	
	public void definirEventos() {
		btnVerde.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {}
			
			@Override
			public void mouseExited(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e) {}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				setBackground(Color.green);
			}
		});
	}
}
