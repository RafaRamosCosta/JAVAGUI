package fiap;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class GUILista extends JPanel{
	private JButton btCalcular;
	private JLabel lbValor;
	private JTextField tfValor, tfValorDesc;
	private JList<String> liDesconto;
	private JScrollPane spLista;
	
	public GUILista() {
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes() {
		setLayout(null);
		setBackground(new Color(255, 255, 0));
		String [] liDescontoItems = {"10%", "20%", "30%", "40%", "50%"};
		
		btCalcular = new JButton("Calcular");
		lbValor = new JLabel("Valor:");
		liDesconto = new JList<String>(liDescontoItems);
		tfValor = new JTextField(5);
		tfValorDesc = new JTextField(5);
		spLista = new JScrollPane(liDesconto);
		
		btCalcular.setToolTipText("Faz o cálculo");
		btCalcular.setMnemonic(KeyEvent.VK_C);
		lbValor.setBounds(35, 05, 100, 25);
		tfValor.setBounds(35, 30, 100, 25);
		spLista.setBounds(35, 60, 100, 55);
		btCalcular.setBounds(35, 120, 90, 25);
		tfValorDesc.setBounds(35, 150, 100, 25);
		add(lbValor);
		add(tfValor);
		add(spLista);
		add(btCalcular);
		add(tfValorDesc);
	}
	
	private void definirEventos() {
		btCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tfValor.getText().equals("")) {
					tfValor.requestFocus();
					return;
				}
				try {
					float valor = Float.parseFloat(tfValor.getText());
					if(liDesconto.getSelectedIndex() == -1) {
						JOptionPane.showMessageDialog(null, "Selecione um item da lista!");
						return;
					}
					float desconto = 0.09f;
					switch (liDesconto.getSelectedIndex()) {
					case 1:
						desconto = 0.08f;
						break;
					case 2:
						desconto = 0.07f;
						break;
					case 3:
						desconto = 0.06f;
						break;
					case 4:
						desconto = 0.05f;
						break;						
					}
					tfValorDesc.setText("" + valor * desconto);
				} catch (NumberFormatException err) {
					JOptionPane.showMessageDialog(null, "Forneça apenas valores numéricos\n" + err.toString());
					tfValor.requestFocus();
				}
			}
		});
	}

}
