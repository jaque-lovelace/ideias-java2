/*
 *5. Crie um algoritmo que receba 2 vetores A e B com 5 números inteiros cada um. Após a
leitura, percorra novamente os vetores e armazene os dados em um vetor C de 10
posições que será o resultado do vetor A + vetor B. Ao final, mostre o vetor C.
 */
package TrabalhoTerceiroBi;


import java.util.Scanner;

/**
 *
 * @author Jaqueline
 */
public class Exercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Integer [] vetorA= new Integer[5];
        Integer [] vetorB= new Integer[5];
        int [] vetorC= new int[10];
        int uniao=0;
        int tamanho= 5;
        
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Entre com um número para o vetor A: ");
            vetorA[i] = leitura.nextInt();
            System.out.println("Entre com um número para o vetor B: ");
            vetorB[i] = leitura.nextInt();
        
        }      
             
        for (int i = 0; i <vetorA.length; i++) {
                vetorC[uniao]= vetorA[i];
                uniao++;
        }        
        for (int i = 0; i < vetorB.length; i++) {
                vetorC[uniao]= vetorB[i];
                uniao++;
        }
        System.out.print("A união do vetor A com o vetor B é vetor C: ");
        for (int i = 0; i <vetorC.length; i++) {
        System.out.print(vetorC[i] + " | " );    
        }
        
    }
        
            
                  
} 
             
        
                  
          
        
       
    
    

