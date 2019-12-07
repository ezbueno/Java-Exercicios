package aulas;

import java.util.*;
import java.io.*;

public class Aula_30 {
    
    public static void main(String[] args) {
        
        int[][] matriz = new int[3][3];
        int aux;
        boolean controle;
        Scanner input = new Scanner(System.in);
        
//        matriz[0][0] = 40;
//        matriz[0][1] = 10;
//        matriz[0][2] = 50;
//        matriz[1][0] = 20;
//        matriz[1][1] = 80;
//        matriz[1][2] = 30;
//        matriz[2][0] = 70;
//        matriz[2][1] = 60;
//        matriz[2][2] = 90;
    
    System.out.println("Insira os valores na matriz:");
    for(int i = 0; i < matriz.length; i++){
        for(int j = 0; j < matriz.length; j++){
            matriz[i][j] = input.nextInt();
        }
        System.out.println();
    }
    
    for(int i = 0; i < matriz.length; i++){
        controle = true;
        for(int j = 0; j < matriz.length; j++){
            for(int x = 0; x < matriz.length; x++){
                for(int y = 0; y < matriz.length; y++){
                    if(matriz[i][j] < matriz[x][y]){
                        aux = matriz[i][j];
                        matriz[i][j] = matriz[x][y];
                        matriz[x][y] = aux;
                        controle = false;
                    }
                }
            }
        }
        if(controle){
            break;
        }
    }
    
    System.out.println("Matriz ordenada");
    for(int i = 0; i < matriz.length; i++){
        for(int j = 0; j < matriz.length; j++){
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
    }
}
