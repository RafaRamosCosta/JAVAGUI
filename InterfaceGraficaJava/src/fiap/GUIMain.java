package fiap;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIMain extends JFrame {
	private Container contentPane;
	private JMenuBar menuBar;
	private JMenu menuArq, menuCor, menuJanela;
	private JMenuItem menuItemSobre, menuItemSair, menuItemAzul, menuItemVerde, menuItemCinza, menuItemCiano,
			menuItemCliente;

	public GUIMain() {
		inicializarComponentes();
		definirEventos();
	}

	public void inicializarComponentes() {
		setTitle("Janela Principal");
		setBounds(0, 0, 800, 600);
		contentPane = getContentPane();

		menuBar = new JMenuBar();
		menuArq = new JMenu("Arquivo");
		menuArq.setMnemonic('A');
		menuCor = new JMenu("Cores");
		menuCor.setMnemonic('C');
		menuJanela = new JMenu("Janela");
		menuJanela.setMnemonic('J');
		menuItemSobre = new JMenuItem("Sobre");
		menuItemSair = new JMenuItem(new ImageIcon(getClass().getResource("exit_icon.png"), "Sair"));
		menuItemAzul = new JMenuItem("Azul");
		menuItemVerde = new JMenuItem("Verde");
		menuItemCinza = new JMenuItem("Cinza");
		menuItemCiano = new JMenuItem("Ciano");
		menuItemCliente = new JMenuItem("Clientes");

		setJMenuBar(menuBar);
		menuBar.add(menuArq);
		menuBar.add(menuCor);
		menuBar.add(menuJanela);
		menuArq.add(menuItemSobre);
		menuArq.add(menuItemSair);
		menuCor.add(menuItemAzul);
		menuCor.add(menuItemVerde);
		menuCor.add(menuItemCinza);
		menuCor.add(menuItemCiano);
		menuJanela.add(menuItemCliente);

	}

	public void definirEventos() {
		menuItemSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ação para fechar o programa
				System.exit(0);
			}
		});

		menuItemSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ação que mostra para o usuário um texto de boas vindas
				JOptionPane.showMessageDialog(null,
						"Seja bem vindo a nossa aplicação, fique à vontade para explorar suas funcionalidades...");
			}
		});

		menuItemAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ação para mudar a cor do fundo para azul
				GUIAzul btnAzul = new GUIAzul();
				contentPane.removeAll();
				contentPane.add(btnAzul);
				contentPane.validate();
			}
		});
		menuItemVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ação para mudar a cor do fundo para azul
				GUIVerde btnVerde = new GUIVerde();
				contentPane.removeAll();
				contentPane.add(btnVerde);
				contentPane.validate();
			}
		});
		menuItemCinza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ação para mudar a cor do fundo para azul
				GUICinza btnCinza = new GUICinza();
				contentPane.removeAll();
				contentPane.add(btnCinza);
				contentPane.validate();
			}
		});
		menuItemCiano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Ação para mudar a cor do fundo para azul
				GUICiano btnCiano = new GUICiano();
				contentPane.removeAll();
				contentPane.add(btnCiano);
				contentPane.validate();
			}
		});
		menuItemCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUICliente clientes = new GUICliente();
				contentPane.removeAll();
				contentPane.add(clientes);
				contentPane.validate();
			}
		});
		
		

	}
}
