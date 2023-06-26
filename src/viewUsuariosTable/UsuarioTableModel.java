
package viewUsuariosTable;


import dao.UsuarioDAO;
import modelo.Usuario;

import javax.swing.table.AbstractTableModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioTableModel extends AbstractTableModel {

    private List<Usuario> usuarios;
    private final UsuarioDAO usuarioDAO;

    public UsuarioTableModel() {
        this.usuarios = new ArrayList<>();
        this.usuarioDAO = new UsuarioDAO();
        carregarUsuarios();
    }

    public void setModel(List<Usuario> data) {
        this.usuarios = data;
        fireTableDataChanged();
    }

    public void carregarUsuarios() {
        try {
            usuarios = usuarioDAO.selectAll();
            fireTableDataChanged();
        } catch (SQLException e) {
            // Tratar o erro de consulta ao banco de dados
            e.printStackTrace();
        }
    }

    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return 5; // Número de colunas na tabela
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Usuario usuario = usuarios.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return usuario.getId();
            case 1:
                return usuario.getNome();
            case 2:
                return usuario.getSenha();
            case 3:
                return usuario.getEmail();
            case 4:
                return usuario.getCelular();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Nome";
            case 2:
                return "Senha";
            case 3:
                return "Email";
            case 4:
                return "Celular";
            default:
                return "";
        }
    }
}
