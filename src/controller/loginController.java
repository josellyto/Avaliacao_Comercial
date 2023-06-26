/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import avaliacaoempresas.Login;
import avaliacaoempresas.TelaPrincipal;
import avaliacaoempresas.UserAdmin;
import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author wesker
 */
public class loginController {
   private Login view;

    public loginController(Login view) {
        this.view = view;
    }
String Nome;
String Senha;
    public void autenticar() throws SQLException{
       //buscar um usuario da tela
        String nome = view.getLogUsername().getText();
        String senha = view.getLogSenha().getText();
        Usuario usuarioAutenticar = new Usuario(nome,senha);
       
        //verificar se existe no banco de dados
         Connection con = new Conexao().getConnection();
            UsuarioDAO usuarioDao = new UsuarioDAO(con);
            boolean existe = usuarioDao.existePorNomeESenha(usuarioAutenticar);
            Nome = nome;
            Senha = senha;
        //se existir direcionar para o menu
         if(nome.equals("")||senha.equals("")){
             JOptionPane.showMessageDialog(null,"os campos precisam ser preenchidos");
         }   
        System.out.println(Nome);
        System.out.println(Senha);
        if(Nome.equals("admin")&&Senha.equals("admin")){
         UserAdmin UserAdmin = new UserAdmin();
         UserAdmin.setVisible(true);
        } else if(existe){
                TelaPrincipal TelaPrincipal = new TelaPrincipal();
            new TelaPrincipal().setVisible(true);     
                    }
            
    else{
            JOptionPane.showMessageDialog(null,"Usuário ou senha invalidos");

    }

 
    }
}
