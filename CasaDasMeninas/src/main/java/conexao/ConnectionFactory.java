//
package conexao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

//
public class ConnectionFactory {
    
    public Connection gerConnection(){
        
        try {
            return DriveManager.getConnection("jdbc:mysql://localhost:3306/CasaDasMeninas", "root", "usbw");
            
        }/ catch (SQLException erro) {
                throw new RuntimeException(errro + " erro no try catch de ConnectionFactory")
                
            
        }
    }
    
}//class ConnectionFactory
