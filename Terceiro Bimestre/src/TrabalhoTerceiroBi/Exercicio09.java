/*
 *9. SISTEMA. Crie um algoritmo que receba em um vetor vários nomes. Você deve criar
uma forma para inserir os elementos no vetor para posteriormente pesquisar por um
nome existente (utilize a estrutura REPITA (do...while) para criar o menu). Considere
que existe no máximo 10 posições o vetor. O programa só deve finalizar ao digitar 0.
=======MENU=========
1) Cadastar nome
2) Pesquisar nome
3) Listar todos os nomes
0) Sair do programa
======================
Digite sua escolha:__
 */
package TrabalhoTerceiroBi;

import java.util.Scanner;


public class Exercicio09 {

    
    public static void main(String[] args) {
        Scanner leitura=new Scanner(System.in);
        int tamanho=3;
        String [] nomes = new String[tamanho];
        int menu=4;
        String nome_pesquisa=("pesquisa");
       
        do{ 
            System.out.println("  =======MENU=========\n" +
                            "1) Cadastar nome\n" +
                            "2) Pesquisar nome\n" +
                            "3) Listar todos os nomes\n" +
                            "0) Sair do programa\n" +
                            "======================\n" +
                            "Digite sua escolha:\n" +
                            "" );
            menu=leitura.nextInt();
            for (int i = 0; i < nomes.length; i++) {
                if(menu==1){
            System.out.print("Cadastre um nome: ");
                nomes[i] = leitura.next();
                }
                if(menu==2){
            System.out.println("Digite um nome para pesquisar:");
                nome_pesquisa=leitura.next();
                }
               if(nome_pesquisa.equalsIgnoreCase(nomes[i])){
            System.out.println("O/A " + nomes[i] + " está na lista ");
                }
                if(menu==3){
            System.out.println("Lista de nomes: " + nomes[i] + "|");
                
                } 
            }
                      
       }while (menu!=0);
        
    }
    
}
    
