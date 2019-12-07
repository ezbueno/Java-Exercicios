package aulas;

import java.util.Scanner;

public class Aula_23 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número de 0 a 10");
        int num = input.nextInt();
        
        for(int i = 0; i <= 10; i++){
            if(i == num){
                System.out.println("O seu número é " + i);
               //break;
            } else {
                System.out.println("O seu número não é " + i);
                continue;
            }
            System.out.println("xxxxxxxxxxx");
        }
        
    }
    
}
