/*
 Crie um programa que receba o salário mínimo e o salário de 10 funcionários. Armazene
em um vetor o salário dos funcionários. Ao final, mostre quantos funcionários recebem
menos que 2 salários mínimos.
 */
package TrabalhoTerceiroBi;

import java.util.Scanner;

/**
 *
 * @author Jaqueline
 */
public class Exercicio01 {

    public static void main(String[] args) {
         Scanner leitura = new Scanner (System.in);
         
            double salarios[]= new double[10];
        
            int menorQue2090= 0;
        
        
        //Entrada de dados - 10 SALÁRIOS
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe um salário : ");
            salarios[i] = leitura.nextDouble();
            
       
       
        
        //Processamento e sáida de dados:
            
            if (salarios[i] < 2090){
                menorQue2090++;
            }
        }
        
       
        System.out.println("Qtde de funcionários que recebem menos que R$2090 : " + menorQue2090);
        
    }
}
    
    

