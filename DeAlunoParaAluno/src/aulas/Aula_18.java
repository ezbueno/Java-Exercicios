package aulas;

import java.util.Scanner;

public class Aula_18 {
    
    public static void main(String[] args) {
      
        //https://pt.wikipedia.org/wiki/Ano_bissexto
        
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um ano: ");
        int ano = input.nextInt();
        
        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
            System.out.println("É um ano bissexto!");
        } else {
            System.out.println("Não é um ano bissexto!");
        }
        
        boolean x = ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0));
        System.out.println(x);
    }
}
