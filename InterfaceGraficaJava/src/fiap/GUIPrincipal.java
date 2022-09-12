package fiap;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class GUIPrincipal extends JFrame{
	private Container contentPane;
	private JMenuBar menuBar;
	private JMenu menuArquivo, menuExemplos;
	private JMenuItem menuItemSair, menuItemBotao;
	
	public GUIPrincipal() {
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
		menuExemplos = new JMenu("Exemplos");
		menuExemplos.setMnemonic('E');
		menuItemSair = new JMenuItem("Sair", new ImageIcon(getClass().getResource("exit_icon.png")));
		menuItemBotao = new JMenuItem("Botao");
		setJMenuBar(menuBar);
		menuBar.add(menuArquivo);
		menuBar.add(menuExemplos);
		menuArquivo.add(menuItemSair);
		menuExemplos.add(menuItemBotao);
	}
	
	private void definirEventos() {
		menuItemSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		menuItemBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIBotao botao = new GUIBotao();
				contentPane.removeAll();
				contentPane.add(botao);
				contentPane.validate();
			}
		});
	}
	
	public void abrir() {
		GUIPrincipal frame = new GUIPrincipal();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((tela.width - frame.getSize().width)/2,(tela.height - frame.getSize().height)/2 );
		frame.setVisible(true);
	}
}
