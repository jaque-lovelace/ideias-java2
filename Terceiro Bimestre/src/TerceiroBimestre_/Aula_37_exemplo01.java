/*
 pesquisar nomes no sistema
 */
package TerceiroBimestre_;

import java.util.Scanner;

/**
 *
 * @author Jaqueline
 */
public class Aula_37_exemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leitura = new Scanner(System.in);
       
       String vetor[]=new String[5];
       
       //Entrada de dados
        for (int i = 1; i < vetor.length; i++) {
            System.out.print("Informe um nome: ");
            vetor[i]= leitura.next();
        }   
           
        //nome a ser pesquisado
        System.out.println("Informe um nome para pesquisar: ");
        String nome = leitura.next();
    
        //Pesquisa
        int encontrou = -1;
        for (int i = 1; i < vetor.length; i++) {
            if(nome.equalsIgnoreCase(vetor[i])){
                encontrou = i;
            }    
        }
        if (encontrou >= 0){
           
            System.out.println(nome +  " existe no vetor, sua posição é: " + encontrou);
        }else{
        
            System.out.println("Nome não existe no vetor ");    
        
        }
        
    }
    
        
    
    
}
