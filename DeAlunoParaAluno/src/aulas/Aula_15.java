package aulas;

import java.util.Scanner;

public class Aula_15 {
    
    public static void main (String[] args){
        
        String primeiroNome, ultimoNome;
        int idade;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o seu primeiro nome: ");
        primeiroNome = input.nextLine();
        
        System.out.print("Digite o seu último nome: ");
        ultimoNome = input.nextLine();
        
        System.out.print("Digite a sua idade: ");
        idade = input.nextInt();
        
        System.out.println("Olá, " + primeiroNome + " " + ultimoNome +
                           " de " + idade + " anos.");

        
    }
    
}
