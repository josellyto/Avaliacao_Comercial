package avaliacaoempresas;
import dao.UsuarioDAO;
import modelo.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class teste2 extends JFrame {

    private JTextField textFieldPesquisa;
    private JButton buttonPesquisar;

    public teste2() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Pesquisa de Usuário");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textFieldPesquisa = new JTextField(20);
        buttonPesquisar = new JButton("Pesquisar");

        buttonPesquisar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pesquisa = textFieldPesquisa.getText();
                try {
                    UsuarioDAO usuarioDAO = new UsuarioDAO();
                    Usuario usuarioEncontrado = usuarioDAO.SelectPorNome(pesquisa);


                    if (usuarioEncontrado != null) {
                        String nome = usuarioEncontrado.getNome();
                        String senha = usuarioEncontrado.getSenha();
                        String email = usuarioEncontrado.getEmail();
                        String celular = usuarioEncontrado.getCelular();

                        // Faça o que desejar com as variáveis nome, senha, email e celular
                        System.out.println("Nome: " + nome);
                        System.out.println("Senha: " + senha);
                        System.out.println("Email: " + email);
                        System.out.println("Celular: " + celular);
                    } else {
                        System.out.println("Usuário não encontrado");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        add(textFieldPesquisa);
        add(buttonPesquisar);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                System.out.println();
            }
        });
    }}

