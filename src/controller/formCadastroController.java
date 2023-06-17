/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import avaliacaoempresas.CadastrarUsuario;
import avaliacaoempresas.Login;
import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author wesker
 */
public class formCadastroController {

    private CadastrarUsuario view;

    public formCadastroController(CadastrarUsuario view) {
        this.view = view;
    }
   
    public void salvaUsuario(){
        
       
         String nome = view.getNomeCad().getText();
       String senha = view.getSenhaCad().getText();
       String email =view.getEmailcad().getText();
       String cel =view.getCelCad().getText();;
        Usuario usuarioadm = new Usuario(nome,senha,email,cel);
        try {
            Connection con = new Conexao().getConnection();
            UsuarioDAO usuarioDao = new UsuarioDAO(con);
            usuarioDao.insert(usuarioadm);
            JOptionPane.showMessageDialog(null,"Usuário cadastrado com sucesso");
            new Login ().setVisible(true);
            
        } catch (SQLException ex) {
            Logger.getLogger(CadastrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
    
    
    
    
}
