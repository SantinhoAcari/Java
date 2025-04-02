//santinho Developer
package academiaedjane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {

    public Connection conectaBancoDados() {
        Connection conexao = null;
        try {
            String url = "jdbc:mysql://localhost:3306/academia";
            String user = "root";
            String password = "";
            conexao = DriverManager.getConnection(url, user, password);

        } catch (SQLException deupau) {
            JOptionPane.showMessageDialog(null, "Drive Banco de Dados não foi achado "
                    + "\n " + deupau, "Eita Deu Erro Chama Santinho "
                            + "849-9451-4190 ", JOptionPane.ERROR_MESSAGE);
        }//catch
        return conexao;
    }//conectaBancoDados

}//conexao
