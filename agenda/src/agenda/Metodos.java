//
package agenda;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

//
public class Metodos {

    String url = "jdbc:mysql://localhost:3306/cadastrar";
    String usuario = "root";
    String senha = "";

    public Connection ConectBD() {

        Connection conn = null;
        String sql = "select * from alunos";

        try {
            conn = DriverManager.getConnection(url, usuario, senha);
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int cod = rs.getInt(1);
                String nome = rs.getString("nome");
                int cpf = rs.getInt(3);
               // System.out.println(cod + " - " + nome + " - " + cpf);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ERRO com a Conexão"
                    + " ao Banco de Dados", "Santinho Avisa", JOptionPane.ERROR_MESSAGE);
        }//catch
        return conn;

    }//ConectBD

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
}//Metodos
