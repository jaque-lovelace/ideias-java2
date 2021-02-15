/*
 2. Crie um algoritmo que receba o nome e a idade de 10 pessoas e armazene em dois
vetores essas informações. Ao final mostre:
a) O nome das pessoas que possui mais de 18 anos.
b) A média das idades.
 */
package TrabalhoTerceiroBi;

import java.util.Scanner;

/**
 *
 * @author Jaqueline
 */
public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leitura = new Scanner(System.in);
        
        String nome[] = new String[10];
        Integer idade[] = new Integer[10];
        double soma = 0;
        
        //entrada de dados
        for (int i = 0; i < nome.length; i++) {
            System.out.println("Informe o nome: ");  
            nome[i] = leitura.next();
            System.out.println("Informe a idade : ");
            idade [i] = leitura.nextInt();   
            int maiorQue18 = 0;
            
            if(idade[i] > 18){
                maiorQue18++;
                
            }
            
        System.out.println("A) Essa pessoa tem mais de 18 anos: " + nome[i]);    
        soma += idade[i] ;     
        }
        System.out.println("B) A média das idades é : " + soma/idade.length);
               
    }
}
    

