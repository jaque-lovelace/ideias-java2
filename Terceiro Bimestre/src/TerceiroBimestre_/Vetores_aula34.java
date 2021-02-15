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
public class Vetores_aula34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double maior = 0, menor = 0;
        Double meuVetor[] = new Double [5];
        
        //entrada de dados de um vetor:
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o " + (i +1)+ " ° valor: ");
            meuVetor[i] = leitura.nextDouble();
            if (i == 0){
                maior = meuVetor[i];
            }
        }
        double soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("posição " + i + " : " +  meuVetor[i]);
           
            
            soma += meuVetor[i];
            
            if(meuVetor[i] > maior){
             maior = meuVetor[i];  
            }
            if (meuVetor[i]<menor){
                menor = meuVetor[i];
            }
                    
           
        }
        System.out.println("A soma é : " + soma);
        System.out.println("A média é : "+ (soma/meuVetor.length));
        System.out.println("O primeiro elemento é " + meuVetor[0]);
        System.out.println("O último elemento é " + meuVetor[meuVetor.length-1]);
        System.out.println("O elemento central é " + meuVetor[meuVetor.length/2]);
        System.out.println("O maior elemento é: " + maior);
        System.out.println("O menorr elemento é: " + menor);
        
    }
    
}
