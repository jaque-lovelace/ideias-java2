/*
 JOptionPane
 */
package TerceiroBimestre_;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Aula_41 {


    public static void main(String[] args) {
        /*Scanner leitura = new Scanner(System.in);
        String s1= leitura.next();
        */
        
        //Entrada de dados
        String nome= JOptionPane.showInputDialog("Informe um nome");
        String idadeString= JOptionPane.showInputDialog("Informe sua idade");
        String valorString= JOptionPane.showInputDialog("Informe o valor do produto");
        String statusString= JOptionPane.showInputDialog("Informe o status ");
        
        
        
        //Conversão
        //String para Integer:
        Integer idade = Integer.parseInt(idadeString);
        
        //String para Double:
        Double valor = Double.parseDouble(valorString);
    
        //String para Boolean:
        Boolean status = Boolean.parseBoolean(statusString);
        
        //Saída de dados
       // JOptionPane.showMessageDialog(null,"Nome: " + nome);
        //JOptionPane.showMessageDialog(null,"Idade: " + idade);
        //JOptionPane.showMessageDialog(null,"Valor: " + valor);
        //JOptionPane.showMessageDialog(null,"Status: " + status);
        
        String saida = "Nome: " + nome + "\n" +
                "Idade: " + idade + "\n" +
                "Valor: " + valor + "\n" +
                "Status: " +(( status)? "Ativo " : "Inativo") ;
        JOptionPane.showMessageDialog(null, saida);
                
        
    }
    
}
