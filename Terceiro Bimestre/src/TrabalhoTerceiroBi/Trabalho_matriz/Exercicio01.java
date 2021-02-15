/*
 1. Crie um algoritmo que leia uma matriz de números inteiros de tamanho 5x5 e a escreva formatada.
 */
package TrabalhoTerceiroBi.Trabalho_matriz;

import java.util.Scanner;

public class Exercicio01 {

 
    public static void main(String[] args) {
          Scanner leitura= new Scanner(System.in);
          Integer matriz [][]= new Integer [5][5];
        
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
              System.out.print("Informe elemento [" + linha + "] [" + coluna + "]: ");
              matriz[linha][coluna] = leitura.nextInt();
                
            }
            
        }
        
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
             System.out.print(matriz[linha][coluna] + "\t");
                
            }System.out.println();
        }
    }    
    
}
    

