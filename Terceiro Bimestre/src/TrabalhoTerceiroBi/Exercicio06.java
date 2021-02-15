/*
 * 6. Crie um programa que receba o número de matrícula, nome da pessoa, idade e nota final
para 5 pessoas. Armazene cada informação em um vetor diferente. Ao final, mostre:
a) Uma listagem com o nome e a nota de todas as pessoas cadastradas.
b) A média das notas.
c) A média das idades.
d) O nome dos alunos com nota maior que 90.
e) A quantidade de alunos que reprovaram (nota final menor que 70).
f) O nome da pessoa que obteve a maior nota (considere que não houve notas iguais).
 */
package TrabalhoTerceiroBi;

import java.util.Scanner;


public class Exercicio06 {

    
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int tamanho=5;
        String [] matricula = new String[tamanho];
        String [] nome = new String[tamanho];
        Integer []idade = new Integer[tamanho];
        double [] nota = new double [tamanho];
        double mediaNotas =0;
        double soma = 0;
        double mediaIdades=0;
        double maiorNota=0;
        int reprovados=0;
        
        
        for (int i = 0; i < nome.length; i++) {
            System.out.println("Entre com o nome do " + (i+1)+ "° aluno: ");
            nome[i]= leitura.next();
            System.out.println("Entre com o número da matrícula: ");
            matricula[i] = leitura.next();
            System.out.println("Entre com a nota final do " + (i+1)+ "° aluno: ");  
            nota[i] = leitura.nextDouble();     
            System.out.println("Entre com a idade do " + (i+1)+ "° aluno: ");  
            idade[i] = leitura.nextInt();
            
    
        }
       for (int i = 0; i < nome.length; i++) {
            System.out.print("a) NOME: " + nome[i] + 
                    " Número de Matrícula: " + matricula[i]); 
                
        }
      
        for (int i = 0; i < nota.length; i++) {
            soma+=nota[i];
            mediaNotas=soma/nota.length;
            nota[i]++;        
        }System.out.println("b) A média geral das notas é: " + mediaNotas);
        
        soma=0;
        for (int i =0;i < idade.length;i++) {
            soma += idade[i];
            mediaIdades=(soma/idade.length);
            idade[i]++;
        }System.out.println("c) A média geral das idades é: " + mediaIdades);
       
        for (int i = 0; i < nome.length; i++) {
            if(nota[i]>=90){
            System.out.println("d) Lista de alunos que alcançaram nota maior que 90 : " + nome[i]);      
        }   
           
        }
        for (int i = 0; i < nota.length; i++) {
            if(nota[i]<70){
                nota[i]=reprovados;
                nota[i]++;
            System.out.println("e) Quantidade de alunos que estão reprovados. Nota menor que 70 : " + nota[i]);      
        }
            
        }
        for (int i = 0; i < nome.length; i++) {
            if(nota[i]>maiorNota){
            maiorNota = nota[i];
            nota[i]++;
            System.out.println("e) O/A Aluno(a) que alcançou a maior nota foi: " + nome[i]);
                        
            }        
        }    
        
        
        
 
    }
}
