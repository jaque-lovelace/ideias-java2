/*
# Exercícios #
1) Crie um programa que tenha um MÉTODO que receba um número por parâmetro e escreva a metade desse número.
- Dica: O método vai ser sem retorno e com o recebimento de 1 parâmetro.

2) Crie um programa que tenha um MÉTODO que receba um número por parâmetro e mostre a tabuada completa desse número (do 1 ao 10).
- Dica: O método vai ser sem retorno e com o recebimento de 1 parâmetro.

3) Crie um programa que tenha um MÉTODO que receba o nome de uma pessoa e mostre um cabeçalho com o seguinte formato:
------------------------------------------------------------------------------
IFPR - INSTITUTO FEDERAL DO PARANÁ
Bem-vindo,
------------------------------------------------------------------------------

- Dica: O método vai ser sem retorno e com o recebimento de 1 parâmetro.

4) Crie um programa que tenha um MÉTODO que receba como parâmetro um número inteiro entre 1 e 10. 
O método deve processar e retornar o número romano correspondente ao número informado. 
O resultado deve ser recebido no método main e mostrado apenas nele.
- Dica 1: O método vai ser com retorno e com o recebimento de 1 parâmetro.
- Dica 2: O comando "System.out.println()" deve existir apenas no método main e não no método auxiliar criado.


 */
package TerceiroBimestre_;

public class ExerciciosMetodo {

    /*
   //1
    public static void main(String[] args) {
        int x= 10;
        
        calculo(x);
     
      
    }
    
    
    
    public static void calculo(int a){
        int calculo = a/2;
        System.out.println(calculo);
       
    }
    */
    
    //2
    public static void main(String[] args) {
         for (int i = 1; i < 10; i++) {
          int  x=i;
            
          tabuada (x*i);
        
       
            
        }
       
     
      
    }
    
    
    
    public static void tabuada(int a){
        int tabuada = a;
        System.out.println(tabuada);
       
    }
    
    
}
    