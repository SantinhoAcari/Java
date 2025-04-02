//
package DAO;

import java.sql.*;
import conexao.ConnectionFactory;
import modelo.Usuario;


//
public class UsuarioDAO {
    private Connection conn;
    int id;
    String nome;
    String sexo;
    String fone;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public Object usuarios;

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public Object getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Object usuarios) {
        this.usuarios = usuarios;
    }
    
    
    
    public UsuarioDAO(){
        this.conn = new ConnectionFactory().getConn();
    }
    
    public void adiciona(Usuario usuario){
        String sql = "insert into contatos (nome, fone, sexo)"
                + "values (?,?,?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getCpf());
            stmt.setString(3, usuario.getFone());
            stmt.execute();
            stmt.close();
            
        } catch (SQLException erro) {
            throw new RuntimeException(errro + "erro try catch usuarioDAO")
        }
    }
    
    
    
}//UsuarioDAO
