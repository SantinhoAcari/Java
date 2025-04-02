//SantinhoDeveloper
package com.mycompany.com.fitness;

//SantinhoDeveloper
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Method {

    public Connection conectarBancoDados() {

        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/fitness,?user=root&password=";
            conn = DriverManager.getConnection(url);

        } catch (SQLException erro) {
            JOptionPane.showInternalMessageDialog(null, "Deu Problema "
                    + "na Conexão com o Banco de Dados\n " + erro, "Santinho Avisa"
                    + "", JOptionPane.INFORMATION_MESSAGE);
        }
        return conn;

    }//conectarBancoDados()
    
    

}//Method
