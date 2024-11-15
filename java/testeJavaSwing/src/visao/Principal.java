package testeJavaSwing.src.visao;

import javax.swing.*;
import java.awt.GridLayout;

public class Principal {
    public Principal(){
        inicializacao();
    }
    private void inicializacao(){
        JFrame frame = new JFrame();

        JPanel painel = new JPanel();
        JPanel painelLogin = new JPanel(new GridLayout(1, 0, 50, 20));
        JPanel painelSenha = new JPanel(new GridLayout());

        JLabel txtLabel = new JLabel("login: ");
        JTextField login = new JTextField(20);
        JLabel txtLabel2 = new JLabel("senha: ");
        JPasswordField senha = new JPasswordField( 10);

        GridLayout grid = new GridLayout(2,1);

        painel.setSize(600, 400);
        painelLogin.setSize(50, 200);
        painelSenha.setSize(50, 200);
        painel.setLayout(grid);

        txtLabel.setBounds(0, 10, 10, 20);
        login.setBounds(0, 0, 50, 10);
        login.setBounds(0, 0, 0, 20);

        painelSenha.add(txtLabel2);
        painelSenha.add(senha);
        painelLogin.add(txtLabel);
        painelLogin.add(login);

        painel.add(painelLogin);
        painel.add(painelSenha);

        frame.add(painel);
        frame.setSize(600, 400);
        frame.setVisible(true);

    }
}
