/*
 2) Faça um algoritmo que leia um vetor A de 10 posições. Preencha 
então um vetor B de 10 posições com o
quadrado de cada valor de A, respeitando as posições dos índices.
 */
package TerceiroBimestre_;

import java.util.Scanner;

/**
 *
 * @author Jaqueline
 */
public class Aula_36_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leitura = new Scanner (System.in);
         double vetorA[]= new double[10];
         double vetorB[]= new double[10];
        
        
        //Entrada de dados
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o " + (i +1) + "° valor: ");
            vetorA[i]= leitura.nextDouble();
            
        }
        
        //Processamento e sáida de dados:
        for (int i = 0; i <10 ; i++) {
           vetorB[i] = Math.pow(vetorA[i],2);
            System.out.print(vetorB[i] + " | ");
               
            
        }
    }
    
}
