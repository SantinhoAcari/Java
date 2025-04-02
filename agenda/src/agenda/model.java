/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author santo
 */
public class model extends AbstractTableModel{
    
        private ArrayList linhas = null;
    private String[] colunas = null;

    

    public modela(ArrayList lin, String[] col){
        
    setLinhas (lin);
    setColunas (col);    
    }
    
    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    public int getColumnCount() {
        return colunas.length;

    }
    
    public int getRowCount() {
        return linhas.size();
    }
    
    
    public String getColumnName(int numcolumna) {
        return colunas [numcolumna]; 
    }
    public Object getValueAt(int numLin, int numCol) {
        Object[] linha = (Object[])getLinhas().get(numLin);
        
        return linha[numCol];

    }
    
}
