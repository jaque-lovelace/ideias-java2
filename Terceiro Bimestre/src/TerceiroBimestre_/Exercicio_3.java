/*
 *3. Crie um programa que receba 5 números do usuário e ARMAZENE NO VETOR o quadrado de cada número.
Ao final, mostre os valores do vetor.
 */
package TerceiroBimestre_;

import java.util.Scanner;

/**
 *
 * @author Jaqueline
 */
public class Exercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double vetor [] = new double [5];
        
        //gravação dos dados:
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe um número: " );
            vetor [i] = Math.pow(leitura.nextDouble(),2);    
        }
        
        //processamento dos dados:
        for (int i = 0; i < 5; i++) {
            System.out.println(vetor[i]);
            
        }
    }
    
}
