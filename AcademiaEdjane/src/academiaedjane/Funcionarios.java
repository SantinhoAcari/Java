//Santinho Developer
package academiaedjane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Funcionarios {

    String Funcao;
    String nome_funcionario, endereco_funcionario, telefone_funcionario;
    String salario_funcionario;
    Connection tbFuncionario;
    PreparedStatement inserirDados;

    public void cadfuncionarios() {

        String sql_tbFuncionarios = "insert into funcionarios"
       + "(nome, salario, funcao, endereco, telefone) value (?, ?, ?, ?, ?)";

        tbFuncionario = new Conexao().conectaBancoDados();
        try {

            inserirDados = tbFuncionario.prepareStatement(sql_tbFuncionarios);
            inserirDados.setString(1, getNome_funcionario());
            inserirDados.setString(2, getSalario_funcionario());
            inserirDados.setString(3, getFuncao());
            inserirDados.setString(4, getEndereco_funcionario());
            inserirDados.setString(5, getTelefone_funcionario());

            inserirDados.execute();
            inserirDados.close();
            tbFuncionario.close();

            JOptionPane.showMessageDialog(null, ""
                    + " ♦ Funcionário ♦ Cadastro Com Sucesso ");

        } catch (Exception depau) {
            JOptionPane.showMessageDialog(null, "eita Chama Santinho que deu "
                    + "Erro na Conexão dos Funcionários " + depau);

        }

    }

    public String getFuncao() {
        return Funcao;
    }

    public void setFuncao(String Funcao) {
        this.Funcao = Funcao;
    }

    public String getNome_funcionario() {
        return nome_funcionario;
    }

    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }

    public String getEndereco_funcionario() {
        return endereco_funcionario;
    }

    public void setEndereco_funcionario(String endereco_funcionario) {
        this.endereco_funcionario = endereco_funcionario;
    }

    public String getTelefone_funcionario() {
        return telefone_funcionario;
    }

    public void setTelefone_funcionario(String telefone_funcionario) {
        this.telefone_funcionario = telefone_funcionario;
    }

    public String getSalario_funcionario() {
        return salario_funcionario;
    }

    public void setSalario_funcionario(String salario_funcionario) {
        this.salario_funcionario = salario_funcionario;
    }

}
