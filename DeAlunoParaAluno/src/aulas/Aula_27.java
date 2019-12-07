package aulas;

import java.util.Scanner;

public class Aula_27 {
    
    public static void main(String[] args) {
        
        int numAlunos = 5;
        double[] notaAlunos = new double[numAlunos];
        
//        notaAlunos[0] = 6.7;
//        notaAlunos[1] = 9.5;
//        notaAlunos[2] = 4.2;
//        notaAlunos[3] = 8.6;
//        notaAlunos[4] = 7.8;

        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < numAlunos; i++){
            System.out.print("Digite a nota do " + (i + 1) + " º aluno: ");
            notaAlunos[i] = input.nextDouble();
        }
        
        System.out.println();
                
        for (int i = 0; i < numAlunos; i++){
            System.out.println("Nota do " + (i + 1) + " º aluno: " + 
                    notaAlunos[i]);
        }
        
    }
    
}
