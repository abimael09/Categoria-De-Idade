
package Categoria_De_Idade;

import javax.swing.JOptionPane;

public class Categoria_De_Idade{
    
    public static void main(String[] args){
        
        String entrada1 = JOptionPane.showInputDialog("Informe seu Nome:");
        String nome = (entrada1);
        System.out.println("Nome: "+nome);
        
        String entrada2 = JOptionPane.showInputDialog("Informe a sua Idade:");
        int idade = Integer.parseInt(entrada2);
        System.out.println("Idade: "+idade+" anos.");
        
        switch(idade){
            case 5:
            case 6:
            case 7:
                System.out.println("Categoria: Infantil A.\n"); 
            break;
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("Categoria: Infantil B.\n");
            break;    
            case 12:
            case 13:
                System.out.println("Categoria: Juvenil A.\n");
            break;
            case 14:
            case 15:
            case 16:
            case 17:
                System.out.println("Categoria: Juvenil B.\n");
            break;
            default:
                System.out.println("Categoria: Adultos maiores de 18 anos.\n");
                
        }
        
    }
    
}
