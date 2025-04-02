//Santinho Developer
package academiaedjane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Professores {

    String NomeProfessores;
    String EndereçoProfessores;
    String TelefoneProfessores;
    String HoraTrabalhadasProfessores;
    String SalarioProfessores;
    String cpf;

    Connection tb_prof;
    PreparedStatement inserir_prof;

    public void cadProf() {

        String sql_tab_prof = "insert into professores(nome, cpf, salario,"
                + " endereco, telefone, horas_trabalhadas) values (?, ?, ?, ?, ?, ?)";

        tb_prof = new Conexao().conectaBancoDados();

        //tem que está dentro do TRY para quando der erro o operador ser informado
        try { 

            inserir_prof = tb_prof.prepareStatement(sql_tab_prof);
            inserir_prof.setString(1, getNomeProfessores());
            inserir_prof.setString(2, getCpf());
            inserir_prof.setString(3, getSalarioProfessores());
            inserir_prof.setString(6, getHoraTrabalhadasProfessores());
            inserir_prof.setString(4, getEndereçoProfessores());
            inserir_prof.setString(5, getTelefoneProfessores());
            
            inserir_prof.execute();
            inserir_prof.close();
            tb_prof.close();
             JOptionPane.showMessageDialog(null, ""
                     + " ♥ Professor ♥ Cadastrado Com Sucesso ");
            
            

        } catch (Exception depau) {
            JOptionPane.showMessageDialog(null, " ☺ Eita deu Erro Chama  ♦ Santinho ♦"
                  + " e diz que deu erro no Cadastro de Professores " + depau);
        }

    }

    public String getNomeProfessores() {
        return NomeProfessores;
    }

    public void setNomeProfessores(String NomeProfessores) {
        this.NomeProfessores = NomeProfessores;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    

    public String getEndereçoProfessores() {
        return EndereçoProfessores;
    }

    public void setEndereçoProfessores(String EndereçoProfessores) {
        this.EndereçoProfessores = EndereçoProfessores;
    }

    public String getTelefoneProfessores() {
        return TelefoneProfessores;
    }

    public void setTelefoneProfessores(String TelefoneProfessores) {
        this.TelefoneProfessores = TelefoneProfessores;
    }

    public String getHoraTrabalhadasProfessores() {
        return HoraTrabalhadasProfessores;
    }

    public void setHoraTrabalhadasProfessores(String HoraTrabalhadasProfessores) {
        this.HoraTrabalhadasProfessores = HoraTrabalhadasProfessores;
    }

    public String getSalarioProfessores() {
        return SalarioProfessores;
    }

    public void setSalarioProfessores(String SalarioProfessores) {
        this.SalarioProfessores = SalarioProfessores;
    }

}
