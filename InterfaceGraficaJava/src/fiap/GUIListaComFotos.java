package fiap;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

@SuppressWarnings("serial")
public class GUIListaComFotos extends JPanel{
	private JList<String> liFotos;
	private ImageIcon imagem1;
	private JScrollPane sp;
	private JLabel lbImagem;
	
	public GUIListaComFotos() {
		inicializarComponentes();
		definirEventos();
	}

	private void inicializarComponentes() {
		setLayout(null);
		setBackground(new Color(255, 0, 255));
		String[] fotos = new String[10];
		for (int i = 0; i < fotos.length; i++) {
			fotos[i] = "Foto" + (i + 1);
		}
		liFotos = new JList<String>(fotos);
		sp = new JScrollPane(liFotos);
		imagem1 = new ImageIcon();
		lbImagem = new JLabel(imagem1);
		sp.setBounds(50, 40, 70, 150);
		lbImagem.setBounds(150, 30, 180, 180);
		add(sp);
		add(lbImagem);
	}
	
	private void definirEventos() {
		liFotos.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				imagem1 = new ImageIcon(getClass().getResource("Imagens/" + liFotos.getSelectedValue() + ".png"));
				lbImagem.setIcon(imagem1);
				JOptionPane.showMessageDialog(null, "Imagem do usuário", "Usuário", JOptionPane.INFORMATION_MESSAGE, imagem1);
			}
		});
	}
}
