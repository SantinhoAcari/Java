//Santinho Developer
package academiaedjane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Convidados {

    String valorApagar;
    String nome_convidado, cpf_convidado;
    
    
    Connection tbconvidados;
    PreparedStatement declararconvidados;
    
    
    public void cadastrarCovidado(){
        String sql_Tb_Convidados = "insert into convidados (nome, cpf, valor_pago) "
                + "values (?, ?, ?)" ;
        
        tbconvidados = new Conexao().conectaBancoDados();
        
        try {
            
            declararconvidados = tbconvidados.prepareStatement(sql_Tb_Convidados);
            declararconvidados.setString(1, getNome_convidado());
            declararconvidados.setString(2, getCpf_convidado());
            declararconvidados.setString(3, getValorApagar());
            
            declararconvidados.execute();
            declararconvidados.close();
            tbconvidados.close();
            JOptionPane.showMessageDialog(null, " Convidado Cadastrado Com Sucesso ");
            
            
            
            
            
        } catch (Exception deupau) {
           JOptionPane.showMessageDialog(null, " ☺ eita ☺ Chama ♥ Santinho ♥ que "
                   + "deu erro no Cadastro de  Convidados " + deupau);
        }


}

    public String getNome_convidado() {
        return nome_convidado;
    }

    public void setNome_convidado(String nome_convidado) {
        this.nome_convidado = nome_convidado;
    }

    public String getCpf_convidado() {
        return cpf_convidado;
    }

    public void setCpf_convidado(String cpf_convidado) {
        this.cpf_convidado = cpf_convidado;
    }

    public String getValorApagar() {
        return valorApagar;
    }

    public void setValorApagar(String valorApagar) {
        this.valorApagar = valorApagar;
    }

}
