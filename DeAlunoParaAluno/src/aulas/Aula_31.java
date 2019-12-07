package aulas;

import java.util.Scanner;

public class Aula_31 {
    
    public static void main(String[] args) {
        
        int[][] matriz = new int[3][3];
        Scanner input = new Scanner(System.in);
        
//        matriz[0][0] = 10;
//        matriz[0][1] = 20;
//        matriz[0][2] = 30;
//        matriz[1][0] = 40;
//        matriz[1][1] = 50;
//        matriz[1][2] = 60;
//        matriz[2][0] = 70;
//        matriz[2][1] = 80;
//        matriz[2][2] = 90;
        
        System.out.println("Insira os valores na matriz:");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = input.nextInt();
            }
            System.out.println();
        }
        
        System.out.println("Valores inseridos:");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("\n");
        }
        
    }
    
}
