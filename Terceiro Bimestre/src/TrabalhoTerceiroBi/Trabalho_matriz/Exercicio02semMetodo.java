/*
 2. Crie um algoritmo que leia uma matriz de tamanho 3x3 de números inteiros.
Ao final,mostre:
a) A matriz formatada;
b) A soma dos elementos de cada linha;
c) A soma dos elementos de cada coluna;
d) A soma dos elementos da diagonal principal;
e) A soma dos elementos da diagonal secundária;
f) A soma de todos os elementos;
g) A média dos elementos da matriz;
h) O maior elemento de cada linha da matriz;
i) O menor elemento da matriz;
j) O maior elemento da matriz;
k) Mostre qual é o elemento que está na linha 2 e coluna 2.
 */
package TrabalhoTerceiroBi.Trabalho_matriz;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;


public class Exercicio02semMetodo {

   
    public static void main(String[] args) {
        Scanner leitura= new Scanner(System.in);
        Random random = new Random();
        DecimalFormat df = new DecimalFormat("##.00");
        Integer matriz [][]= new Integer [3][3];
        float soma=0;
        float soma0=0;
        float soma1=0;
        float soma2=0;
        float soma0_1=0;
        float soma1_1=0;
        float soma2_1=0;
        double media=0;
        int maiorLinha1=0;
        int maiorLinha2=0;
        int maiorLinha3=0;
        
        
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.println("Informe elemento [" + linha + "] [" + coluna + "]: ");
                matriz[linha][coluna] = random.nextInt(15);  
            }
        }
        
        //a) matriz formatada
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {   
            System.out.print( matriz[linha][coluna] + "\t");
                
            }System.out.println();
        }
        System.out.println("\n");
        //k        
        System.out.println("O elemento na posição de linha 2, coluna 2 é : " + matriz[1][1]);
        
        //b) soma linha      
            for (int coluna = 0; coluna < matriz[0].length; coluna++) { 
                soma0+= matriz[0][coluna];            
                soma1+=matriz[1][coluna];
                soma2+=matriz[2][coluna];
       
            }   System.out.println("soma da Linha 1: " + soma0);  
                System.out.println("soma da Linha 2: " + soma1);
                System.out.println("soma da Linha 3:" + soma2);
        
       //c) soma coluna
        System.out.println();
        
        for (int linha = 0; linha < matriz[0].length; linha++) {
            soma0_1+=matriz[linha][0];
            soma1_1+=matriz[linha][1];     
            soma2_1+=matriz[linha][2];
        }
        System.out.println("soma da Coluna 1:" +soma0_1);
        System.out.println("soma da Coluna 2:" + soma1_1);
        System.out.println("soma da Coluna 3: " + soma2_1);
        
        
        //d)
        System.out.println("soma da diagonal principal: ");
        soma=0;
        soma+=matriz[0][0]+ matriz[1][1]+matriz [2][2];  
        System.out.println(soma);
        
        //e)
        soma=0;
        System.out.println("soma da diagonal secundária: ");
        soma+=matriz[0][2]+ matriz[1][1]+matriz [2][0];  
        System.out.println(soma);
        
        //f) 
        System.out.println("soma de todos os elementos: ");
        double somaTotal=0;
        for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                somaTotal+=matriz[0][coluna]+ matriz [1][coluna]+ matriz [2] [coluna];
                
        }System.out.println(somaTotal);
        
        //g
            media=0;
            for (int coluna = 0; coluna <matriz.length; coluna++) {
                for (int linha = 0; linha < matriz[0].length; linha++) {
                  media =  somaTotal/Math.pow(matriz.length,2);  
                }
            
            }System.out.println("A média de todos os elementos é: " + df.format(media));
            
        //h)
        for (int coluna = 0; coluna < matriz[0].length; coluna++) {
            if(matriz[0][coluna]>maiorLinha1){
                maiorLinha1=matriz[0][coluna];
                matriz[0][coluna]++;  
            }    
          
            if(matriz[1][coluna]>maiorLinha2){
                maiorLinha2=matriz[1][coluna];
                matriz[1][coluna]++;  
            }    
         
            if(matriz[2][coluna]>maiorLinha3){
                maiorLinha3=matriz[2][coluna];
                matriz[2][coluna]++;  
            }       
        }
        System.out.println("Maior número da linha 1: " + maiorLinha1);
        System.out.println("Maior número da linha 2: " + maiorLinha2);
        System.out.println("Maior número da linha 3: " + maiorLinha3);
        
         //j
        int menordaMatriz=0;
        int maiordaMatriz=0;
        
        for (int coluna = 0; coluna < matriz.length; coluna++) {
          for (int linha = 0; linha < matriz.length; linha++){
            if(matriz[linha][coluna] > maiordaMatriz){
                maiordaMatriz = matriz[linha][coluna];
                matriz[linha][coluna]++;
            }
          }
        }
        System.out.println("Maior número da matriz: " + (maiordaMatriz-1)); 
        
        menordaMatriz=maiordaMatriz;
        for (int coluna = 0; coluna < matriz.length; coluna++) {
          for (int linha = 0; linha < matriz.length; linha++){
            if(matriz[linha][coluna] < menordaMatriz){
                menordaMatriz = matriz[linha][coluna];
                matriz[linha][coluna]++;
            }
          }
        }
        System.out.println("Menor número da matriz: " + menordaMatriz);        
            
    }
       
}    
