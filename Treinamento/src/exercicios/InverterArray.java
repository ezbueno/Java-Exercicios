package exercicios;

import java.util.Scanner;

public class InverterArray {
    
    public static void main(String[] args) {
          
        Scanner input = new Scanner(System.in);
        double[] v1 = new double[5];
             
        System.out.println("===========================");
        System.out.println("| Vamos preencher o vetor |");
        System.out.println("===========================");
        
        for (int i = 0; i < v1.length; i++){
            System.out.println("Digite o " + (i + 1) + " º número: ");
            v1[i] = input.nextDouble();
        }
        
        System.out.println();
        
        System.out.print("Sequência digitada: ");
        
        for (int i = 0; i < v1.length; i++){
            System.out.print(v1[i] + ", ");
        }
        
        System.out.println();
        System.out.println();
        
        double[] v2 = inverterValor(v1);
        
        System.out.print("Sequência invertida: ");
        
        for (int i = 0; i < v2.length; i++){
            System.out.print(v2[i] + ", ");
        }
        
        System.out.println();
        System.out.println();
    }
    
    public static double[] inverterValor(double[] vetorX){
        double[] vetorY = new double[vetorX.length];
        
        for (int i = 0, j = vetorY.length - 1; i < vetorX.length; i++, j--){
            vetorY[j] = vetorX[i];
        }
        
        return vetorY;
    }
}
