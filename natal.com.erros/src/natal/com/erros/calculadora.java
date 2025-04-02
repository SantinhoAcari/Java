/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package natal.com.erros;

/**
 *
 * @author 1282227687
 */
public class calculadora {

    public static void main(String[] args) {
        System.out.println("                     T A B O A D A do \n  "
                + "               ♥♥Santinho Developer♡♡\n");

        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //int num2[] = 

        for (int i = 0; i < 10; i++) {

            if ((num[1] * i)<10 && (num[2] * i)<10 | (num[0] * i) < 10) {

                System.out.println(num[0] + " x " + i + "  = " +(num[0] * i) + "      ♦     "
                        + num[1] + " x " + i + "  = " +" "+ (num[1] * i) + "      ♦     "
                        + num[2] + " x " + i + "  = " + " "+(num[2] * i));
            }else if ((num[2] * i)>10){
                        System.out.println(num[0] + " x " + i + "  = " + (num[0] * i) + "      ♦     " 
                    + num[1] + " x " + i + "  = " + (num[1] * i) + "      ♦     " 
                    + num[2] + " x " + i + "  = " +""+(num[2] * i));
                        }
                  
        

        /* for(int j=0; j<11; j++){
          System.out.print("   ");
               
            System.out.println(num[3] +" x " + j + "  = " + (num[3]*j) + "      ♠     " +  num[4]  + " x " +j+"  = "+(num[4]*j)+ "      ♠     " + num[5]  + " x " +j+"  = "+(num[5]*j));
            
     }
        
        System.out.println("\n");
        
       for(int k=0; k<11; k++){
               
            System.out.println(k +" x " + num[6] + "  = " + (k*num[6]) + "      ♣     " + k + " x " + num[7] +"  = "+(k*num[7])+ "      ♣     " + k + " x " + num[8] +"  = "+(k*num[8]));
        }
        
        System.out.println("\n"); */
    }

}
}
