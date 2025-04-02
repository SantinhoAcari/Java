//Santinho 55-84-99451-4190
package modelagens.dao;

import com.sun.jdi.connect.spi.Connection;
import conexao.connectoFactory;
import javax.swing.JOptionPane;
//
public class ClienteDAO {
                                    //getConnection é padrao nao foi construido(feito)
    Connection bdd = connectoFactory.getConnection();
    PreparedStatement stmt = null;
    
    try{
    stmt = bdd.prepareStatement ("INSERT INTO clientes (nome, cpf, endereco, preco) VALUES (?,?,?,?,");
    stmt.setString(1, c.getNome());
    stmt.setString(2, c.getCpf());
    stmt.setString(3, c.getEndereco());
    stmt.executeUpdate();
    JOptionPane.showMessageDialog(null, "Sucesso :-D");
    
}catch (SQLException ex1){
            System.out.println("ex1");
}finally{
    ConnectioFactory.closeConnection(bdd, stmt);
    
}
    
}
public List<Cliente> read(){
    Connection bdd = connectoFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet resultado = null;
        List<Cliente> clientes = new ArrayList<>();
        try{
            stmt = bdd.prepareStatement ("SELECT * FROM CLIENTES");
            resultado = stmt.executeQuery();
            while(resultado.next()){
            Cliente cliente = new Cliente();
            cliente.setid_cliente(resultado.getid_cliente("id_cliente"));

}
}
}
