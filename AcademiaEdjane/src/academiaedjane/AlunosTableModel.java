/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academiaedjane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author santo
 */
public class AlunosTableModel extends AbstractTableModel{
        
    
    private List<Alunos> bcoalunos = new ArrayList<>();
    private String[] colunas = {"C.P.F", "Aluno", "Telefone","Valor Mensalidade"};

        
        public List<Alunos> readBd(){
        
            Connection conn = new Conexao().conectaBancoDados();
            PreparedStatement ps = null;
            ResultSet rs = null;
            String sql = "select * from alunos";
            
           try{
               
               ps = conn.prepareStatement(sql);
               ps.executeQuery();
           }catch(SQLException deupau){
               String msg = "Erro ao Ler do Banco de dados (read BD) ";
               String titulo = "Santinho Avisa - Erro no (read) ";
               ImageIcon icon = new ImageIcon("c:\\documentos\\santin.png");
               /**
                * 0 = msg erro
                * 1 = msg informação aviso
                * 2 = msg warning alerta
                * 3 = msg pergunta ?
                */
                              
               JOptionPane.showMessageDialog(null, msg, titulo, 0, icon);
           }
            
            
        
        
        }
        
        @Override
        public String getColumnName(int column) {
            return colunas[column];
        }

        @Override
        public int getRowCount() {
         return bcoalunos.size();
        }

        @Override
        public int getColumnCount() {
            return colunas.length;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            switch (columnIndex){
                
                case 0:
                    return bcoalunos.get(rowIndex).getCpf_aluno();
                case 1:
                    return bcoalunos.get(rowIndex).getNome_aluno();
                case 2: 
                    return bcoalunos.get(rowIndex).getTelefone_aluno();
                case 3:
                    return bcoalunos.get(rowIndex).getMensalidade_aluno();
            
            }
            return null;
        }
    
    }