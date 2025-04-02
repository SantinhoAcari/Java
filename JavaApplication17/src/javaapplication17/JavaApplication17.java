/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author 1282227687
 */
public class JavaApplication17 {

    public static void main(String[] args) {

        //Construindo um objeto

        //Instanciando a classe Elevador

        Elevador e=new Elevador();

        e.setMarca("Otis");

        e.transportar(1500); 

        System.out.println("Passageiros: "+e.getPassageiros());

        System.out.println("Carga: "+e.getCarga());

    }

}
