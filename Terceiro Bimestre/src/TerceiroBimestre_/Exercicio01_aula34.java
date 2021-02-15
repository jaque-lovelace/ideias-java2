/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TerceiroBimestre_;

import java.util.Scanner;

/**
 *
 * @author Jaqueline
 */
public class Exercicio01_aula34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);
        double vetor []= new double [10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um valor: " );
            vetor[i] = leitura.nextDouble();
            
        }
        int positivos = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println(vetor[i]);
               
        if(vetor[i] > 0 ){
          positivos++;
                   
        }
            
    }
        System.out.println(" NÚMEROS POSITIVOS " + positivos);
    
  }
}