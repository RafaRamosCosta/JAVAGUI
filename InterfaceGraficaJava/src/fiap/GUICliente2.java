package fiap;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

@SuppressWarnings("serial")
public class GUICliente2 extends JPanel{
	private JLabel lbNome, lbEndereco, lbNumero, lbBairro, lbCidade, lbSexo, lbAparelhos;
	private JTextField tfNome, tfEndereco, tfNumero, tfBairro, tfCidade;
	private JButton btSalvar, btCancelar;
	private ButtonGroup btGroup;
	private JRadioButton rbMasculino, rbFeminino;
	private JCheckBox ckCelular, ckVideoGame, ckComputador, ckTablet;
	
	public GUICliente2() {
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes() {
		setLayout(null);
		
		// criando objetos para o formulário
		lbNome = new JLabel("Nome:", JLabel.RIGHT);
		lbEndereco = new JLabel("Endereço:", JLabel.RIGHT);
		lbNumero = new JLabel("Número:", JLabel.RIGHT);
		lbBairro = new JLabel("Bairro:", JLabel.RIGHT);
		lbCidade = new JLabel("Cidade: ", JLabel.RIGHT);
		lbSexo = new JLabel("Selecione o sexo:");
		lbAparelhos = new JLabel("Selecione o(s) aparelho(s) que possui:");
		tfNome = new JTextField();
		tfEndereco= new JTextField();
		tfNumero= new JTextField();
		tfBairro= new JTextField();
		tfCidade = new JTextField();
		btGroup = new ButtonGroup();
		rbMasculino = new JRadioButton("Masculino");
		rbFeminino = new JRadioButton("Feminino");
		rbMasculino.setSelected(true);
		btGroup.add(rbMasculino);
		btGroup.add(rbFeminino);
		ckCelular = new JCheckBox("Celular");
		ckVideoGame = new JCheckBox("Video-Game");
		ckComputador = new JCheckBox("Computador");
		ckTablet = new JCheckBox("Tablet");
		btSalvar = new JButton("Salvar");
		btCancelar = new JButton("Cancelar");
		
		// definindo tamanho e posição dos objetos
		lbNome.setBounds(10,30,60,25);
		tfNome.setBounds(80,30,180,25);
		lbEndereco.setBounds(10,75,60,25);
		tfEndereco.setBounds(80,75,290,25);
		lbNumero.setBounds(10,120,60,25);
		tfNumero.setBounds(80,120,50,25);
		lbBairro.setBounds(140,120,60,25);
		tfBairro.setBounds(210,120,160,25);
		lbCidade.setBounds(10,165,60,25);
		tfCidade.setBounds(80,165,180,25);
		lbSexo.setBounds(10, 210, 100, 25);
		rbMasculino.setBounds(10, 240, 100, 25);
		rbFeminino.setBounds(10, 270, 100,25);
		lbAparelhos.setBounds(10, 290, 300, 25);
		ckCelular.setBounds(10, 310, 100, 25);
		ckVideoGame.setBounds(120, 310, 100, 25);
		ckComputador.setBounds(10, 340, 100, 25);
		ckTablet.setBounds(120, 340, 100, 25);
		btSalvar.setBounds(90,380,100,25);
		btCancelar.setBounds(195,380,100,25);
		
		// adicionando os objetos ao formulário
		add(lbNome);
		add(tfNome);
		add(lbEndereco);
		add(tfEndereco);
		add(lbNumero);
		add(tfNumero);
		add(lbBairro);
		add(tfBairro);
		add(lbCidade);
		add(tfCidade);
		add(lbSexo);
		add(rbMasculino);
		add(rbFeminino);
		add(lbAparelhos);
		add(ckCelular);
		add(ckVideoGame);
		add(ckComputador);
		add(ckTablet);
		add(btSalvar);
		add(btCancelar);
	}
	
	private void definirEventos() {
		btCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dados = "Informações:\n\n";
				dados += "Nome: " + tfNome.getText() + "\n";
				dados += "Endereço: " + tfEndereco.getText() + "\n";
				dados += "Número: " + tfNumero.getText() + "\n";
				dados += "Bairro: " + tfBairro.getText() + "\n";
				dados += "Cidade: " + tfCidade.getText() + "\n";
				if (rbMasculino.isSelected()) {
					dados += "Sexo: Masculino";
				}
				else dados += "Sexo: Feminino";
				JOptionPane.showMessageDialog(null, dados);
			}
		});
	}
}
