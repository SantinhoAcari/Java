/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author 1282227687
 */
public class arraylist {
    public static void main(String[] args) {
        System.out.println("♥ ♥ ♥ ♥ Santinho Developer ♥ ♥ ♥ ♥");
       //LinkedList<String>numeros = new LinkedList<>(); Usado em uma grande Lista
        ArrayList<String>numeros = new ArrayList<>();
        Scanner numeroLista = new Scanner(System.in);
        System.out.println("      Lista de Heróis");
        System.out.println("");
        
        numeros.add("Capitão América"); 
        numeros.add("Thor");
        numeros.add("Pantera Negra");
        numeros.add("Homem de Ferro");
        numeros.add("Gavião");
        numeros.add("Viúva");
        numeros.add("Vespa");
        numeros.add("Homem Formiga");
        Collections.sort(numeros);
        
        for(String i: numeros){
            System.out.println(i);
        
        
    }
    }  
}
