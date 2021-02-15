/*
 3) Crie um algoritmo que leia 100 números e armazene em um vetor. AO FINAL, mostre apenas:
a) Qual é o maior número e qual é a sua posição no vetor. 
b) Qual é o menor número e qual é a sua posição no vetor. 

 */
package TerceiroBimestre_;


import java.util.Random;


/**
 *
 * @author Jaqueline
 */
public class Aula_36_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Random random= new Random();
         Integer vetorA[]= new Integer[100];
         Integer maior = vetorA[0];
        
         int maiorPos = 0;
         
          for (int i = 0; i < 100; i++) {
           vetorA[i] = random.nextInt (1000); 
        }
         
          
         
             
                  
              
            for (int i = 0; i < 100; i++){
            if(vetorA [i] > maior){
            maiorPos = i;
            maior= vetorA [i];
            System.out.println(" Maior número :" + maior + maiorPos);
            
            }  
        }
          
    }
    
}
