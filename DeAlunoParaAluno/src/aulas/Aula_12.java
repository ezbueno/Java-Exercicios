package aulas;

import java.util.Scanner;

public class Aula_12 {
    
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o valor em gramas: ");
        int gramas = input.nextInt();
        
        int kilos = gramas / 1000;
        gramas = gramas % 1000;
        
        System.out.println("O total de kilos é = " + kilos);
        System.out.println("O total de gramas é = " + gramas);
        
        
    }
    
}
