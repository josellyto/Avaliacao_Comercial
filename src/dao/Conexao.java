
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexao {
   public Connection getConnection() throws SQLException{
       String url="jdbc:postgresql://localhost:5432/avaliacao";
       String user = "postgres";
       String password = "brito2000";
   Connection Conexao = DriverManager.getConnection(url,user,password);
     return Conexao;
   }
}

