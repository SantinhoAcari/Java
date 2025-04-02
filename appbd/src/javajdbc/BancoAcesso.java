//
package javajdbc;

//
public class BancoAcesso {
    public static void main(String[] args) throws Exception{
        
        String sql = "select nome, cpf, indentidade from contatos";
        String url = "http://localhost/phpmyadmin/index.php?route=/sql&server=1&db=exames&table=hemograma&pos=0";
        
        try {
            Connection con = DriveManager.getConnection(url, "exames", "exame123");
            preparedStatement stm = con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery())
        } catch (Exception e) {
        }
        
    }
    
}//BancoAcesso
