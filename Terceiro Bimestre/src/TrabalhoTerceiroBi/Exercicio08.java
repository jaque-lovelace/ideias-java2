/*
 8. Hospital. Um hospital recebe diariamente várias pessoas. Crie um programa de recepção
para cadastrar esses pacientes. O programa deve receber o nome, a idade e o caso clínico
do paciente (1 – Emergência; 2 – Urgente; 3 – Não urgente). Armazene esses valores em
3 vetores diferentes. Ao final, mostre:
a. Quantos casos de emergência ocorreu no dia.
b. Qual foi a média de idade dos pacientes atendidos.
c. Qual foi a média de idade dos pacientes atendidos nos casos de emergência.
d. Quantos pacientes menores que 18 anos foram atendidos.
* O total de atendimentos realizados no dia foi de 500. Então você deve criar um laço de
repetição que receba os dados de 500 pacientes.
 */
package TrabalhoTerceiroBi;

import java.util.Scanner;


public class Exercicio08 {

    
    public static void main(String[] args) {
        Scanner leitura= new Scanner (System.in);
        int tamanho= 3;
        String [] nome= new String[tamanho];
        Integer[] idade= new Integer[tamanho];
        Integer [] caso_clinico= new Integer[tamanho];
        int soma_idades=0;
        int soma_quantidade=0;
        double media=0;
    
         //Entrada de dados:       
        for (int i = 0; i < nome.length; i++) {
            System.out.println("Entre com o nome do paciente: ");
            nome[i]= leitura.next();
            System.out.println("Entre com a idade do paciente: ");
            idade[i]= leitura.nextInt();
            System.out.println("Entre com a situação do paciente "
                    + "(1- Emergência; 2- Urgente; 3- Não Urgente) : ");
            caso_clinico[i]= leitura.nextInt();   
        }
        //A
        for (int i = 0; i <caso_clinico.length; i++) {
            if(caso_clinico[i]==1){
                i+=soma_quantidade;
                soma_quantidade++;
                
            }    
        }System.out.println("Número de pacientes para emergência: " + soma_quantidade);
        
        //C
        for (int i = 0; i < idade.length; i++) {
            if(caso_clinico[i]==1){
             soma_idades+=idade[i];
             media=soma_idades/soma_quantidade;
             
            } 
        }System.out.println("A média das idades dos pacientes na emergência é: " + media);
        //B
        soma_idades=0;
        soma_quantidade=0;
        media=0;
        for (int i = 0; i < idade.length; i++) {
            soma_idades+=idade[i];
            media=soma_idades/idade.length;  
        }System.out.println("A média da idades dos pacientes é: " + media);
        //D
        soma_quantidade=0;
        for (int i = 0; i < idade.length; i++) {
            if(idade[i] < 18){
            i+=soma_quantidade;
            soma_quantidade++;
                
            }   
        }System.out.println(soma_quantidade + " pacientes têm menos de 18 anos.");
       
   
    }
}     
        
          
    

