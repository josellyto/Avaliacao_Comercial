package avaliacaoempresas;

import dao.UsuarioDAO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuario;

public class teste {
    
    public static void main(String[] args) {
        
         teste testeInstance = new teste();
    testeInstance.setVisible(true);
        
        
    }public teste(){
        Object usuarios = null;
        try {
            // Estabelecer a conexão com o banco de dados
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/avaliacao", "postgres", "brito2000");

            // Criar uma instância do UsuarioDAO passando a conexão como parâmetro
            UsuarioDAO usuarioDAO = new UsuarioDAO(connection);

            // Obter a lista de usuários do banco de dados
            ArrayList<Usuario> listaDeUsuarios = usuarioDAO.selectAll();

            // Criar os dados para a tabela
            Object[][] data = new Object[listaDeUsuarios.size()][4];
            for (int i = 0; i < listaDeUsuarios.size(); i++) {
                Usuario usuario = listaDeUsuarios.get(i);
                data[i][0] = usuario.getNome();
                data[i][1] = usuario.getSenha();
                data[i][2] = usuario.getEmail();
                data[i][3] = usuario.getCelular();
                usuarios = usuario;
            }

            // Criar as colunas da tabela
            String[] columns = {"Nome", "Senha", "Email", "Celular"};

            // Criar o modelo da tabela com os dados e colunas
            DefaultTableModel model = new DefaultTableModel(data, columns);
            System.out.println(data);
            System.out.println(listaDeUsuarios);

            // Criar a tabela com o modelo
            JTable table = new JTable(model);

            // Criar um painel de rolagem para a tabela
            JScrollPane scrollPane = new JScrollPane(table);

            // Criar um painel para conter a tabela com barra de rolagem
            JPanel panel = new JPanel();
            panel.add(scrollPane);

            // Criar uma janela para exibir o painel com a tabela
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            frame.setSize(500, 400);
            frame.add(panel);
            frame.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(teste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setVisible(boolean visible) {
        JFrame frame = new JFrame();
        frame.setVisible(visible);
    }

}