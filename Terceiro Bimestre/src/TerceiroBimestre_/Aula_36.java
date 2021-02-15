/*
 1) Crie um algoritmo que receba o salário de 10 funcionários e armazene em um vetor. Ao final, mostre:
a) O maior salário.
b) O menor salário.
c) A soma de todos os salários (valor total gasto pela empresa com os funcionários).
d) A média salarial.
e) Quantos funcionários recebem menos de R$1000,00 reais.
f) Quantos funcionários recebem mais de R$5.000,00 reais.
g) Mostre quanto ficaria a soma total dos salários se for dado
um reajuste salarial de 15% para cada funcionário.

 */
package TerceiroBimestre_;

import java.util.Scanner;

/**
 *
 * @author Jaqueline
 */
public class Aula_36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);
        double salarios[]= new double[10];
        double menor = 0, maior = 0;
        int menorQue1000= 0;
        
        
        //Entrada de dados - 10 SALÁRIOS
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe um salário : ");
            salarios[i] = leitura.nextDouble();
            
        }
        
        //Processamento e sáida de dados:
        menor = salarios [0];
        maior = salarios [0];
        double soma = 0;
      
        for (int i = 0; i < 10 ; i++) {
              //a
            if(salarios [i]> maior){
            maior= salarios [i];
              //b
            if(salarios [i]< menor){
            menor = salarios [i];
            
            }
            }
            
            soma += salarios [i];
            if (salarios[i] < 1000){
                menorQue1000++;
            }
        }
        System.out.println("a) Maior salário:" + maior);
        System.out.println("b) Menor salário:" + menor);
        System.out.println("c) Soma de salário:" + soma);
        //d
        System.out.println("d) A média salarial é : " + soma/10);
        System.out.println("e) Qtde de funcionários que recebem menos que R$1000 : " + menorQue1000);
        double valorSomaReajuste = soma*1.15;
        System.out.println("g) A soma dos salários com 15% de reajuste  é : " + valorSomaReajuste);
        
    }
}