package aulas;

import java.util.Scanner;

public class Aula_16 {
    
    public static void main (String[] args){
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Qual é o seu nome?");
        String nome = input.nextLine();
        
        System.out.println("Qual é a sua idade?");
        int idade = input.nextInt();
        
        if (idade >= 1 && idade < 18){
            System.out.println("Olá, " + nome + "! Você é menor de idade");
        }else if (idade >= 18){
            System.out.println("Olá, " + nome + "! Você é maior de idade");
        }else {
            System.out.println("Idade inválida!");
        }
        
    }
    
}
