/*
 * 1. Crie um programa que armazene no vetor (tamanho 10) 
todos os números do intervalo fechado de 11 a 20
(automaticamente, sem entrada de dados pelo Scanner). Ao final, mostre:
a) Quantos números pares e quantos números ímpares existe no vetor (Use o operador módulo %).
b) A metade de cada número.

 */
package TerceiroBimestre_;

/**
 *
 * @author Jaqueline
 */
public class Exercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int vetor [] = new int [10];
        
        int  posicao =0;
        //gravação de dados do vetor
        for(int valor = 11; valor <= 20; valor++){//repetição quie vai de 11 a 20- 10 posições
            System.out.println(valor);
            vetor [posicao] = valor;
            posicao++;
            
        }
        //processamento
        int par = 0, impar = 0;
        
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % 2 == 0){
                par++;
            }else{
                impar++;
            }
       //a
            System.out.println("qtde de pares: " + par);
            System.out.println("qtde de ímpares: " + impar);
        }
    }
    
}
