//
package com.mycompany.com.fitness;

//
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ComFitness {

    public static void main(String[] args)throws SQLException {
        
        Connection mt = null;
        
        try {
           mt = DriverManager.getConnection("jdbc:mysql://localhost/cadastrar", "root", "");
          mt.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "problema na "
                    + "Conexão do Main", "Santinho Avisa\n",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }//main
}//Comfitness
