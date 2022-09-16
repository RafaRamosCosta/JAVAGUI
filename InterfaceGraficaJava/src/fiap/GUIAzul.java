package fiap;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GUIAzul extends JPanel{
	private JButton btnAzul;
	
	public GUIAzul() {
		inicializarComponentes();
		definirEventos();
	}
	
	public void inicializarComponentes() {
		btnAzul = new JButton("Azul");
		btnAzul.setBounds(50, 20, 140, 40);
		
		add(btnAzul);
	}
	
	public void definirEventos() {
		btnAzul.addMouseListener(new MouseListener() {
			
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
				setBackground(Color.blue);
			}
		});
	}
}
