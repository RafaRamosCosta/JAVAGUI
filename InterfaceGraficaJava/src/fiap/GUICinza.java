package fiap;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GUICinza extends JPanel{
	private JButton btnCinza;
	
	public GUICinza() {
		inicializarComponentes();
		definirEventos();
	}
	
	public void inicializarComponentes() {
		btnCinza = new JButton("Cinza");
		btnCinza.setBounds(50, 20, 140, 40);
		
		add(btnCinza);
	}
	
	public void definirEventos() {
		btnCinza.addMouseListener(new MouseListener() {
			
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
				setBackground(Color.gray);
			}
		});
	}
}
