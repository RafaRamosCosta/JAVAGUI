package fiap;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GUICiano extends JPanel{
	private JButton btnCiano;
	
	public GUICiano() {
		inicializarComponentes();
		definirEventos();
	}
	
	public void inicializarComponentes() {
		btnCiano = new JButton("Ciano");
		btnCiano.setBounds(50, 20, 140, 40);
		
		add(btnCiano);
	}
	
	public void definirEventos() {
		btnCiano.addMouseListener(new MouseListener() {
			
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
				setBackground(Color.cyan);
			}
		});
	}
}
