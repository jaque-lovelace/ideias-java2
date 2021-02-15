//método sem retorno
package TerceiroBimestre_;


public class Aula_46_Metodo_Retorno {

    
   /* public static void main(String[] args) {
        mensagem();
        mensagem("Oi, eu sou um parâmetro enviado para o método");
    }
    
    public static void mensagem(){
        System.out.println("Oi, eu fui chamado do método main");
    }
    
    public static void mensagem(String msg) {
        System.out.println(msg);
        
    }*/
    
    public static void main (String [] args){
        Integer soma = soma(10,20);
        mensagem ("Resultado: " + soma);
        
        
    }
    public static Integer soma (Integer a, Integer b){
        Integer c = a + b;
        return c;
    }
    public static void mensagem (String msg){
        System.out.println(msg);
    }
}

