package fiap;

import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class GUICarro extends JFrame{
    private JLabel lbPlaca, lbCor, lbDescricao;
    private JTextField tfPlaca, tfCor, tfDescricao;
    private JButton btSalvar, btCancelar;

    public GUICarro() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setTitle("Cadastro de Carro");
        setBounds(0,0,300,250);
        setLayout(null);

        // criando objetos para o formulário
        lbPlaca = new JLabel("Placa:", JLabel.RIGHT);
        lbCor = new JLabel("Cor:", JLabel.RIGHT);
        lbDescricao = new JLabel("Descrição:", JLabel.RIGHT);
        tfPlaca = new JTextField();
        tfCor = new JTextField();
        tfDescricao = new JTextField();
        btSalvar = new JButton("Salvar");
        btCancelar = new JButton("Cancelar");

        // definindo tamanho e posição dos objetos
        lbPlaca.setBounds(10, 30, 80, 25);
        tfPlaca.setBounds(110, 30, 120, 25);
        lbCor.setBounds(10, 75, 80, 25);
        tfCor.setBounds(110, 75, 120, 25);
        lbDescricao.setBounds(10, 120, 80, 25);
        tfDescricao.setBounds(110, 120, 120, 25);
        btSalvar.setBounds(40, 165, 100, 25);
        btCancelar.setBounds(145, 165, 100, 25);

        // adicionando os objetos ao formulário
        add(lbPlaca);
        add(tfPlaca);
        add(lbCor);
        add(tfCor);
        add(lbDescricao);
        add(tfDescricao);
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
				JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
			}
		});
    }
}
