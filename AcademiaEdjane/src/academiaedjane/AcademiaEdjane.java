//Santinho Developer
package academiaedjane;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import telaapp.CadastrarAlunos;
import telaapp.CadastrarConvidado;
import telaapp.CadastrarFuncionario;
import telaapp.telaPrincipal;


public class AcademiaEdjane {

   
    public static void main(String[] args) throws SQLException {
        
       // Conexao conn = new Conexao();
        
       //telaapp.telaPrincipal tp = new telaPrincipal();
      // tp.setVisible(true);
      
      String msg = "Erro ao Ler do Banco de dados (read BD) ";
               String titulo = "Santinho Avisa - Erro no (read) ";
               ImageIcon icon = new ImageIcon("C:\\Users\\santo\\OneDrive\\Documentos\\santin_inteligente.png");
               /**
                * 0 = msg erro
                * 1 = msg informação aviso
                * 2 = msg warning alerta
                * 3 = msg pergunta ?
                */
                              
               JOptionPane.showMessageDialog(null, msg, titulo, 0, icon);
       
        
        
        
        
        
        
    }//main
    
}//AcademiaEdjane
