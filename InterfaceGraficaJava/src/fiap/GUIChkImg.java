package fiap;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class GUIChkImg extends JPanel{
	private JLabel lbImg;
	private ImageIcon img;
	private JCheckBox ck1, ck2, ck3;
	private JButton btSair;
	
	public GUIChkImg() {
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes() {
		setLayout(null);
		setBackground(Color.lightGray);
		
		img = new ImageIcon();
		lbImg = new JLabel(img);
		ck1 = new JCheckBox("opcao 1");
		ck2 = new JCheckBox("opcao 2");
		ck3 = new JCheckBox("opcao 3");
		btSair = new JButton("Sair");
		
		lbImg.setBounds(60, 20, 100, 100);
		ck1.setBounds(15, 20, 100, 15);
		ck2.setBounds(15, 50, 100, 15);
		ck3.setBounds(15, 80, 100, 15);
		btSair.setBounds(50, 150, 100, 20);
		
		add(lbImg);
		add(ck1);
		add(ck2);
		add(ck3);
		add(btSair);
	}
	
	private void definirEventos() {
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
}
