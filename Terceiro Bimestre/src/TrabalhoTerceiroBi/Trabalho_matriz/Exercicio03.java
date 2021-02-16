/*
3. Numa fábrica de parafusos é recolhido uma amostra de 6 parafusos diariamente para
medição e pesagem. Faça um programa para:
a) Receber os valores do peso e do comprimento (mm) de cada parafuso da amostra.
b) Calcular e mostrar o peso médio e o comprimento médio dos parafusos da amostra.
c) Mostrar o comprimento do menor e maior parafuso.
d) Calcular e mostrar a diferença de tamanho entre o parafuso mais curto e o mais
comprido.
e) Calcular e mostrar o percentual de parafusos com peso superior à média da amostra.
 */
package TrabalhoTerceiroBi.Trabalho_matriz;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;

public class Exercicio03 {

    
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Random random = new Random();
        DecimalFormat df = new DecimalFormat("##.00");
        Integer matriz[][]= new Integer [6][2];
     
        //a
        for (int parafuso =0;parafuso  < matriz.length; parafuso++) {
             System.out.println("Informe o peso em gramas:");
             matriz[parafuso][0] = random.nextInt(15);
             System.out.println("Informe o comprimento em mm: ");
             matriz[parafuso][1] = random.nextInt(15);    
        }
        
            System.out.println("     ===== Parafusos ======"+ "\n" +
            "peso-gramas" + "\t" + "\t" + "comprimento-mm ");
        for (int parafuso = 0; parafuso < matriz.length; parafuso++) {
            for (int parametro = 0; parametro < matriz[0].length; parametro++) {
                
            System.out.print(matriz[parafuso][parametro] + "\t" + "\t"+ "\t");
                
            }System.out.println();
        }
        
        
        //b
        double somapeso= 0;
        double somacomp=0;
        double mediapeso=0;
        double mediacomp=0;
        for (int parafuso = 0; parafuso < matriz.length; parafuso++) {
            somapeso+= matriz[parafuso][0];
            mediapeso = somapeso/matriz.length;
            somacomp+= matriz[parafuso][1];
            mediacomp = somacomp/matriz.length;
            
        }System.out.println("A média de peso dos parafusos é: " + df.format(mediapeso) + " gramas");
         System.out.println("A média de comprimento dos parafusos é: " + df.format(mediacomp) + " mm");
        
         //c
        int maiorComp=0;
        int menorComp=0;
        for (int parafuso = 0; parafuso < matriz.length; parafuso++) {
            if(matriz[parafuso][1]>maiorComp){
                maiorComp=matriz[parafuso][1];
                matriz[parafuso][1]++;
            }
            
        }System.out.println("O maior parafuso tem " + maiorComp + " mm.");
        
        menorComp=maiorComp;
        for (int parafuso = 0; parafuso < matriz.length; parafuso++) {
            if(matriz[parafuso][1]<menorComp){
                menorComp=matriz[parafuso][1];
                matriz[parafuso][1]++;    
            }
               
        }System.out.println("O menor parafuso tem " + menorComp + " mm.");
     
       //d)
        System.out.println("Diferença de tamanho entre menor e maior parafuso:  "
                + (maiorComp-menorComp)+ " mm");
        
        //e)
        int codigo1=1;
        int codigo2=0;
        int acimadopeso=0;
        for (int parafuso = 0; parafuso <matriz.length; parafuso++) {
            if (matriz[parafuso][0] > mediapeso) {
                matriz[parafuso][0]=codigo1;
                acimadopeso+=codigo1;
            } else {
                matriz[parafuso][0]=codigo2;
                
            }
            
        } System.out.println(acimadopeso + " parafusos estão com peso acima da média da amostra,"
                + " o que representa " + (acimadopeso*100/6) + " % da amostra.");   
           
    }     
    
}
