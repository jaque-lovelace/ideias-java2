/*
 4. Crie um algoritmo que leia dois vetores A e B com 5 números cada um. Crie um vetor C
que receba o resultado da soma de cada posição do vetor A e do vetor B. Ao final,
mostre todos os elementos do vetor C.
 */
package TrabalhoTerceiroBi;


import java.util.Scanner;

/**
 *
 * @author Jaqueline
 */
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Integer [] vetorA= new Integer[5];
        Integer [] vetorB= new Integer[5];
        Integer [] vetorC= new Integer[vetorB.length];
        double soma =0;
        
        
        for (int i = 0; i < vetorC.length; i++) {
            System.out.println("Entre com um número para o vetor A: ");
            vetorA[i] = leitura.nextInt();
            System.out.println("Entre com um número para o vetor B: ");
            vetorB[i] = leitura.nextInt();
            vetorC[i]=(vetorA[i]+vetorB[i]);
            soma +=vetorC[i];
            
        }System.out.println("A soma dos vetores A e B é: " + soma);
 
    } 
}
    

