/*
 *7. Crie um programa para receber de 5 pessoas: código do paciente (número inteiro), nome
do paciente (texto), idade (número inteiro), altura (número fracionário) e um status
dizendo o caso clínico do paciente, se é grave ou não (booleano: verdadeiro/falso).
Armazene cada informação em um vetor diferente. Ao final, mostre:
a) Uma listagem exibindo o código, nome, idade, altura e status clínico dos
pacientes cadastrados.
b) A média de idade dos pacientes.
c) A média de altura dos pacientes.
d) A quantidade de paciente(s) que possuem caso clínico grave.
e) O nome do(s) paciente(s) que possuem caso clínico grave.
* Os tipos de dados são sugeridos e podem ser mudados conforme a necessidade do
programador.
 */
package TrabalhoTerceiroBi;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Exercicio07 {
    public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    int tamanho = 3;
    Integer [] codigo = new Integer[tamanho];
    String []nome = new String [tamanho];
    Integer [] idade = new Integer [tamanho];
    Float [] altura = new Float[tamanho];
    Boolean []status = new Boolean[tamanho];
    double soma=0;
    double medias=0;
    DecimalFormat df = new DecimalFormat("##.00");
    
    
        for (int i = 0; i < codigo.length; i++) {
            System.out.println("Entre com o código do paciente: ");
            codigo[i]= leitura.nextInt();
            System.out.printf("Primeiro nome do paciente:");
            nome[i]=leitura.next();
            System.out.println("Entre com a idade do paciente: ");
            idade[i]=leitura.nextInt();
            System.out.println("Entre com a altura do paciente(ex. 1,58): ");
            altura[i]=leitura.nextFloat();
            System.out.println("Entre com o status do paciente(true - para estado"
                    + " grave; false - para não grave): ");
            status[i]= leitura.nextBoolean();
                
        }
        //A
        System.out.println("Lista de pacientes");
        System.out.println("Código\tNome\tIdade\taltura\tStatus");
        System.out.println("=================================");
        for (int i = 0; i < status.length; i++) {
            String descStatus = (status[i])?" Grave" : "Normal";
            System.out.println( codigo[i] + "\t"  + nome[i] + "\t" + idade[i] + "\t" 
                    + altura[i] + "\t" + status[i]);   
        }
        //B
        for (int i = 0; i < idade.length; i++) {
            soma+=idade[i];
            medias = soma/idade.length;
            
        }System.out.println("A média das idades é: " + df.format(medias));
        
        //C 
        soma=0;
        medias=0;
         for (int i = 0; i < altura.length; i++) {
            soma+=altura[i];
            medias = soma/altura.length;
            
        }System.out.println( "A média das alturas é: " + df.format(medias));
        
        soma=0;
        for (int i = 1; i < nome.length; i++) {
            if(status[i]==true){
            soma+=i;
            i++;
            
       /*D*/System.out.println( "Há " + i + " paciente(s) em estado grave. " );
      /*E*/ System.out.println("Pacientes em estado grave:  " + nome[i] );  
            }
        }   
    }
   
}            
    

