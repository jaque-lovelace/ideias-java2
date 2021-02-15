/*
 * 1) Faça um programa que carregue um vetor com dez números reais,
calcule e mostre a quantidade de números negativos e a soma dos 
números positivos desse vetor.

 */
package TerceiroBimestre_;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jaqueline
 */
public class Aula_37_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Random random= new Random();
        double[] vetor =new double [10];
        
        double soma =0;
        int negativos =0;
        for (int i = 0; i <10; i++) {
           vetor[i] = random.nextDouble();
           if (vetor [i] < 0){
               negativos++;
           }
           if (vetor[i] > 0){
               soma += vetor[i];
           }
        }
        System.out.println(" Qtde de números negativos é: " + negativos);
        System.out.println(" A soma dos números positivos é: " + soma);
    }
    
}
