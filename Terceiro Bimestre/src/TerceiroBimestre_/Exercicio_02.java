/*
 * 2. Modifique o exercício anterior para armazenar os valores de 20 a 10.

 */
package TerceiroBimestre_;

/**
 *
 * @author Jaqueline
 */
public class Exercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double vetor [] = new double [11];
        
        int  posicao =0;
        
        //gravação de dados do vetor
        for(int valor = 20; valor >= 10; valor--){//repetição que vai de 20 a 11 - 11 posições
          
            vetor [posicao] = valor;
            posicao++;
       
            
        }
        //processamento
        int par = 0, impar = 0;
        
        for (int i = 0; i < 11; i++) {
            if (vetor[i] % 2 == 0){
                par++;
            }else{
                impar++;
       
            
            }
            System.out.println("A metade de : " + vetor[i] + " é " + vetor[i]/2 );
            
         }     
       //a
            System.out.println("qtde de pares: " + par);
            System.out.println("qtde de ímpares: " + impar);
           
        }
    }
    

