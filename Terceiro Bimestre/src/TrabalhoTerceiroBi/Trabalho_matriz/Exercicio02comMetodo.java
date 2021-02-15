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
*h) O maior elemento de cada linha da matriz;
*i) O menor elemento da matriz;
*j) O maior elemento da matriz;
k) Mostre qual é o elemento que está na linha 2 e coluna 2.
 */
package TrabalhoTerceiroBi.Trabalho_matriz;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Exercicio02comMetodo {

   
    public static void main(String[] args) {
        Scanner leitura= new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.00");
        Integer matriz [][]= new Integer [3][3];
        int soma=soma(matriz);
        int maiorLinha=0;
        
        
        
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print("Informe elemento [" + linha + "] [" + coluna + "]: ");
                
                matriz[linha][coluna] = leitura.nextInt();
                
            }
            
        }
        //a) matriz formatada
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {   
            System.out.print(matriz[linha][coluna] + "\t");
                
            }System.out.println();
        }
        
        //b) soma linha
        System.out.println("soma da Linha 1");
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) { 
                soma+= matriz[linha][coluna];
            }
        } System.out.println(soma);   
        /*for (int coluna = 0; coluna < matriz[0].length; coluna++) {
            soma= matriz[0][0]+matriz[0][1]+matriz[0][2];
              
        }System.out.println(soma); */
        
        
        System.out.println("soma da Linha 2");
        for (int coluna = 0; coluna < matriz[0].length; coluna++) {
            
            soma+=matriz[1][coluna];
            
        }System.out.println(soma); 
        
        
        System.out.println("soma da Linha 3");
        for (int coluna = 0; coluna < matriz[0].length; coluna++) {
            
            soma=matriz[2][coluna];
       
        } System.out.println(soma);
        
       //c) soma coluna
        System.out.println("soma da Coluna 1");
        
        for (int linha = 0; linha < matriz[0].length; linha++) {
            soma=matriz[linha][0];
            
        }System.out.println(soma);
        
        
        System.out.println("soma da Coluna 2");
        
        for (int linha = 0; linha < matriz[0].length; linha++) {
            soma=matriz[linha][1];
            
        }System.out.println(soma);
        
        
        System.out.println("soma da Coluna 3");
        
        for (int linha = 0; linha < matriz[0].length; linha++) {
            
            soma=matriz[linha][2];
            
        }System.out.println(soma);
        
        
        //d)
        System.out.println("soma da diagonal principal: ");
        
        soma=matriz[0][0]+ matriz[1][1]+matriz [2][2];  
        System.out.println(soma);
        
        //e)
        System.out.println("soma da diagonal secundária: ");
        
        soma=matriz[0][2]+ matriz[1][1]+matriz [2][0];  
        System.out.println(soma);
        
        //f) 
        System.out.println("soma de todos os elementos: ");
        
        double media=0;
        for (int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                
                soma=matriz[0][coluna]+ matriz [1][coluna]+ matriz [2] [coluna];
                media = soma/matriz.length;
            }
        }System.out.println(soma);
        System.out.println("A média de todos os elementos é: " + df.format(media));
        
        
        
        
        
        //h)
        for (int linha = 0; linha < matriz.length; linha++) {
            if(linha<maiorLinha){
           linha= maiorLinha ;
            maiorLinha++;  
            }    
          }System.out.println(" Maior número da linha 1: " + maiorLinha);  
          
        
         //k)
        System.out.println("O elemento na posição de linha 2, coluna 2 é : " + matriz[1][1]);
    }
    
    public static int soma (Integer matriz[][]) {
        int soma = matriz.length;
        
        return soma;
        
    }
    
    
    
}    

