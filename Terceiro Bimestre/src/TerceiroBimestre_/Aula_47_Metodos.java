/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TerceiroBimestre_;

/**
 *
 * @author Jaqueline
 */
public class Aula_47_Metodos {

    
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        soma(x,y);
        /*metodo2();*/
        
        int a=0;
        for (int i = 0; i < 2; i++) {
            x=i;
            y=45;
            soma(x,y);
            
        }
       
    }
    
    
     /*public static void metodo2() {
        int x = 20;
        int y = 20;
        soma(x,y);
       
    }*/
     
    public static void soma(int x, int y) {
        int soma=x + y;
       //return soma;
       System.out.println(soma); 
    }
}   

