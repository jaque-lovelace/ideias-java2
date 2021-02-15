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
public class Exercicio3_aula34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double altura[] = new double[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um valor : ");
            altura[i]= leitura.nextDouble();
       }
        for (int i = 0; i < 10; i++) {
           if (altura[i] > 1.80){
           System.out.println(altura[i] + " altura ok ");
            
        }
           
    }
 }
}
