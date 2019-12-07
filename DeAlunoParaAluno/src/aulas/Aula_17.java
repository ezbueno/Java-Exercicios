package aulas;

import java.util.Scanner;

public class Aula_17 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro:");
        int num = input.nextInt();
        
        if ((num % 2 == 0) || (num < 20)){
            System.out.println("OK");
        }
        
    }
    
}
