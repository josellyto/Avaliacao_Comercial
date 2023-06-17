/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Usuario;

public class UsuarioDAO {

    private final Connection connection;
    private Object usuarioLogin;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }

    public void insert(Usuario usuario) throws SQLException {
        String sql = "insert into usuario(nome, senha, email, celular) values (?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, usuario.getNome());
        statement.setString(2, usuario.getSenha());
        statement.setString(3, usuario.getEmail());
        statement.setString(4, usuario.getCelular());
        statement.execute();

    }

    public void inserir(Usuario usuarioLogin) throws SQLException {
        String sql = "insert into usuario(nome, senha) values (?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, usuarioLogin.getNome());
        statement.setString(2, usuarioLogin.getSenha());

    }

    public void update(Usuario usuario) throws SQLException {
        String sql = "update usuario set nome = ?,senha = ?,email = ?, celular = ? where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, usuario.getNome());
        statement.setString(2, usuario.getSenha());
        statement.setString(3, usuario.getEmail());
        statement.setString(4, usuario.getCelular());
        statement.setInt(5, usuario.getId());
        statement.execute();
    }

    public void insertOrUpdate(Usuario usuario) throws SQLException {
        if (usuario.getId() > 0) {
            update(usuario);
        } else {
            insert(usuario);
        }
    }

    public void delete(Usuario usuario) throws SQLException {
        String sql = "delete from usuario where Id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, usuario.getId());
    }

    public ArrayList<Usuario> selectAll() throws SQLException {
        String sql = "select * from usuario";
        PreparedStatement statement = connection.prepareStatement(sql);

        return pesquisar(statement);
    }

    private ArrayList<Usuario> pesquisar(PreparedStatement statement) throws SQLException {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

        statement.execute();
        ResultSet resultSet = statement.getResultSet();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String nome = resultSet.getString("nome");
            String senha = resultSet.getString("senha");
            String email = resultSet.getString("email");
            String cel = resultSet.getString("celular");
            Usuario usuarioComDadosDoBanco = new Usuario(id, nome, senha, email, cel);
            usuarios.add(usuarioComDadosDoBanco);
        }
        return usuarios;
    }

//    public Usuario SelectPorId() {
//
//    }

    public boolean existePorNomeESenha(Usuario usuarioLogin) throws SQLException {

        String sql = "SELECT * FROM usuario WHERE nome = ? AND senha = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, usuarioLogin.getNome());
        statement.setString(2, usuarioLogin.getSenha());

        ResultSet resultSet = statement.executeQuery();
        return resultSet.next();

    }

}
