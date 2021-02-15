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
public class Aula_35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Integer numeros [] = new Integer [5];
        
        for (int pos = 0; pos < numeros.length; pos++) {
            numeros[pos] = leitura.nextInt();
        }
    
        for (int pos = 0; pos < numeros.length; pos++) {
            System.out.println("Posição " + pos + " - " + numeros[pos]);
        }
    }
    
    
}
