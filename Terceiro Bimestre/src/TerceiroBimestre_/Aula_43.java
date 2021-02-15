/*
formatação de matriz
 */
package TerceiroBimestre_;

import java.util.Scanner;


public class Aula_43 {

    public static void main(String[] args) {
        Scanner leitura= new Scanner(System.in);
        
        Integer matriz [][]= new Integer [3][3];
        
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
        //soma linha
        System.out.println("Linha fixa");
        int soma=0;
        for (int coluna = 0; coluna < matriz[0].length; coluna++) {
            soma+=matriz[0][coluna];
            
        }
        System.out.println(soma);
        
        //soma coluna
        System.out.println("Coluna Fixa");
        soma=0;
        for (int linha = 0; linha < matriz.length; linha++) {
            soma+=matriz[linha][0];
            
        }
        System.out.println(soma);
    }
    
}
