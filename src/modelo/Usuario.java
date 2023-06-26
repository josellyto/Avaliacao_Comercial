
package modelo;

public class Usuario {
   private int id;
   private String nome;
   private String senha;
   private String email;
   private String celular;
  

    public  Usuario(int id, String nome, String senha, String email, String celular) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.celular = celular;
    }

    public Usuario(String nome, String senha, String email, String celular) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.celular = celular;
    }
    
public Usuario() {
    // Construtor vazio
}
// Exemplo do método setNome()
public void setNome2(String nome) {
    this.nome = nome;
}

  public int getId(){
       return id;
      
  }
 public Usuario(String nome) {
        this.nome = nome;}
 
    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }
  public void setId(){
      
  }
  public String getNome(){
       return nome;
      
  }
 public void setNome(){
     
 }
 public String getSenha(){
       return senha;
     
 }
 public void setSenha(){
     
 }
  public String getEmail(){
       return email;
     
 }
 public void setEmail(){
     
 }
  public String getCelular(){
       return celular;
     
 }
 public void setCelular(){
     
 }

    public Usuario get(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getTelefone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNome(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
