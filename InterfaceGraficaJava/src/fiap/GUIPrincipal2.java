package fiap;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class GUIPrincipal2 extends JFrame{
	private Container contentPane;
	private JMenuBar menuBar;
	private JMenu menuArquivo, menuCadastros;
	private JMenuItem menuItemSair, menuItemCliente;
	
	public GUIPrincipal2() {
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes() {
		setTitle("Janela Principal");
		setBounds(0,0,800,600);
		contentPane = getContentPane();
		menuBar = new JMenuBar();
		menuArquivo = new JMenu("Arquivo");
		menuArquivo.setMnemonic('A');
		menuCadastros = new JMenu("Cadastros");
		menuItemSair = new JMenuItem("Sair", new ImageIcon(getClass().getResource("exit_icon.png")));
		menuItemCliente = new JMenuItem("Cliente");
		setJMenuBar(menuBar);
		menuBar.add(menuArquivo);
		menuBar.add(menuCadastros);
		menuArquivo.add(menuItemSair);
		menuCadastros.add(menuItemCliente);
	}
	
	private void definirEventos() {
		menuItemSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		menuItemCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUICliente2 cliente = new GUICliente2();
				contentPane.removeAll();
				contentPane.add(cliente);
				contentPane.validate();
			}
		});
	}
}
