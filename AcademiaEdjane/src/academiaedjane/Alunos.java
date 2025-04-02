//Santinho Developer
package academiaedjane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import telaapp.CadastrarAlunos;

public class Alunos {

    String nome_aluno, endereco_aluno, cpf_aluno, telefone_aluno;
    String idade_aluno;
    String mensalidade_aluno;
    String multraAtrazo_aluno;

    Connection tbaluno;
    PreparedStatement declarar;
    
 

    public void cadastrarAluno() {
        String sql_Tb_Alunos = "INSERT INTO alunos (nome, cpf, idade, mensalidade,"
                + " multa, endereco, telefone) VALUES (?, ?, ?, ?, ?, ?, ?)";

        tbaluno = new Conexao().conectaBancoDados();
        
        

        try {
            
            telaapp.telaPrincipal tp = new telaapp.telaPrincipal();
            
            declarar = tbaluno.prepareStatement(sql_Tb_Alunos);
            declarar.setString(1, getNome_aluno());
            declarar.setString(2, getCpf_aluno());
            declarar.setString(3, getIdade_aluno());
            declarar.setString(4, getMensalidade_aluno());
            declarar.setString(5, getMultraAtrazo_aluno());
            declarar.setString(6, getEndereco_aluno());
            declarar.setString(7, getTelefone_aluno());
            
            declarar.execute();
            declarar.close();
            tbaluno.close();
            
            JOptionPane.showMessageDialog(null, " Aluno Cadastro Com Sucesso");
         
        } catch (SQLException deupau) {
            JOptionPane.showMessageDialog(null, "eitaChama Santinho que deu erro no Cadastrar Aluno " + deupau);
        }

    }
 
    public String getNome_aluno() {
        return nome_aluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public String getEndereco_aluno() {
        return endereco_aluno;
    }

    public void setEndereco_aluno(String endereco_aluno) {
        this.endereco_aluno = endereco_aluno;
    }

    public String getCpf_aluno() {
        return cpf_aluno;
    }

    public void setCpf_aluno(String cpf_aluno) {
        this.cpf_aluno = cpf_aluno;
    }

    public String getTelefone_aluno() {
        return telefone_aluno;
    }

    public void setTelefone_aluno(String telefone_aluno) {
        this.telefone_aluno = telefone_aluno;
    }

    public String getIdade_aluno() {
        return idade_aluno;
    }

    public void setIdade_aluno(String idade_aluno) {
        this.idade_aluno = idade_aluno;
    }

  
    public String getMensalidade_aluno() {
        return mensalidade_aluno;
    }

    public void setMensalidade_aluno(String mensalidade_aluno) {
        this.mensalidade_aluno = mensalidade_aluno;
    }

    public String getMultraAtrazo_aluno() {
        return multraAtrazo_aluno;
    }

    public void setMultraAtrazo_aluno(String multraAtrazo_aluno) {
        this.multraAtrazo_aluno = multraAtrazo_aluno;
    }

}
