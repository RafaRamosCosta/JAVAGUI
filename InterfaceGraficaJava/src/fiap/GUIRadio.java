package fiap;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class GUIRadio extends JPanel{
	private JLabel lbSexo;
	private JButton btVerificar;
	private JRadioButton rbMasculino, rbFeminino;
	private ButtonGroup buttonGroup;
	
	public GUIRadio() {
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes() {
		setLayout(null);
		setBackground(Color.magenta);
		
		lbSexo = new JLabel("Selecione o sexo:");
		btVerificar = new JButton("Verificar");
		rbMasculino = new JRadioButton("Masculino");
		rbMasculino.setBackground(getBackground());
		rbFeminino = new JRadioButton("Feminino");
		rbFeminino.setBackground(getBackground());
		buttonGroup = new ButtonGroup();
		buttonGroup.add(rbMasculino);
		buttonGroup.add(rbFeminino);
		
		lbSexo.setBounds(55, 10, 105, 30);
		rbMasculino.setBounds(55, 45, 100, 25);
		rbFeminino.setBounds(55, 70, 100, 25);
		btVerificar.setBounds(55, 105, 100, 20);
		rbMasculino.setSelected(true);
		add(lbSexo);
		add(rbMasculino);
		add(rbFeminino);
		add(btVerificar);
	}
	
	private void definirEventos() {
		btVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rbMasculino.isSelected()) {
					JOptionPane.showMessageDialog(null, "Masculino selecionado");
				} else {
					JOptionPane.showMessageDialog(null, "Femninino selecionado");
				}
			}
		});
	}
}
