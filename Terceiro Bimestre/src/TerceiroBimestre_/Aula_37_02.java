/*
 2) Crie um algoritmo que receba o nome e o número da casa de 
10 moradores de um condomínio. Armazene as informações em dois
vetores diferentes. A seguir, receba do usuário o nome do morador
e mostre na tela qual é o número da casa que ele mora. 
Se o morador existir, mostre a mensagem: 
“O FULANO mora na casa 3”; caso ele não exista, mostre a mensagem: 
“O FULANO não mora nesse condomínio”. 

 */
package TerceiroBimestre_;

import java.util.Scanner;

/**
 *
 * @author Jaqueline
 */
public class Aula_37_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        
        int tamanho = 3;
        String nome[] = new String[tamanho];
        Integer numeros[] = new Integer[tamanho];
        
        //entrada de dados
        for (int i = 0; i < nome.length; i++) {
            System.out.println("Informe o nome do morador: ");  
            nome[i] = leitura.next();
            System.out.println("Informe o número da casa: ");
            numeros [i] = leitura.nextInt();
                    
            
        }
          System.out.println("Informe um nome para pesquisar");
          String nomes = leitura.next();
          
          for (int i = 0; i < tamanho; i++) {
              if(nomes.equalsIgnoreCase(nome[i])){
              System.out.println("O/A " + nome[i] + " mora na casa " + numeros[i]);
              }
            
        }
        
        
                
    }
    
}
