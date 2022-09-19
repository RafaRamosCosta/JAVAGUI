package fiap;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class GUICaixaOpcao extends JPanel {
	private JButton btVerificar, btMarcar, btDesmarcar;
	private JCheckBox ckIngles, ckInformatica;

	public GUICaixaOpcao() {
		inicializarComponentes();
		definirEventos();
	}

	private void inicializarComponentes() {
		setLayout(null);
		setBackground(Color.orange);
		btVerificar = new JButton("Verificar");
		btMarcar = new JButton("Marcar");
		btDesmarcar = new JButton("Desmarcar");
		ckIngles = new JCheckBox("Inglês");
		ckIngles.setBackground(getBackground());
		ckInformatica = new JCheckBox("Informática");
		ckInformatica.setBackground(getBackground());
		ckIngles.setBounds(15, 15, 100, 15);
		ckInformatica.setBounds(15, 40, 100, 15);
		btVerificar.setBounds(20, 70, 100, 20);
		btMarcar.setBounds(20, 100, 100, 20);
		btDesmarcar.setBounds(20, 130, 100, 20);
		add(ckIngles);
		add(ckInformatica);
		add(btVerificar);
		add(btMarcar);
		add(btDesmarcar);
	}

	private void definirEventos() {
		btMarcar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ckIngles.setSelected(true);
				ckInformatica.setSelected(true);
			}
		});
		
		btDesmarcar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ckIngles.setSelected(false);
				ckInformatica.setSelected(false);
			}
		});
		
		btVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selecao = "Selecionados:";
				if (ckIngles.isSelected()) {
					selecao += "\nInglês";
				}
				if (ckInformatica.isSelected()) {
					selecao += "\nInformática";
				}
				if (!ckIngles.isSelected() && !ckInformatica.isSelected()) {
					selecao += "\nNenhum item selecionado";
				}
				JOptionPane.showMessageDialog(null, selecao);
			}
		});
	}

}
