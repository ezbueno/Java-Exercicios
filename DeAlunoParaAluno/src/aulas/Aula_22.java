package aulas;

import java.util.Scanner;
import java.util.Random;

public class Aula_22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        boolean acertou = false;
        int tentativas = 10;
        int numSecreto = random.nextInt();
        long chute = 0;
        
        System.out.println(numSecreto);
        while (tentativas > 0 && acertou == false){
            System.out.println("Qual é o seu chute?");
            chute = input.nextLong();
            
            if (numSecreto == chute){
                System.out.println("Você acertou!");
                acertou = true;
            } else if (chute < numSecreto){
                --tentativas;
                System.out.println("Número muito pequeno!" + tentativas + 
                        " tentativas restantes");
            } else {
                --tentativas;
                System.out.println("Número muito grande!" + tentativas + 
                        " tentativas restantes");
            }
        }
    }
            
}
