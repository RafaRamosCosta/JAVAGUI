package fiap;


import java.awt.*;
import javax.swing.*;

public class UsaCarro {
    public static void main(String[] args) {
        GUICarro frame = new GUICarro();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height) / 2);
		frame.setVisible(true);
    }
}
