package aulas;

import java.util.*;

public class Aula_11 {
    
    public static void main (String[] args){
              
        final double PI = 3.1416;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o valor do raio: ");  
        double raio = input.nextDouble();
        
        double area = raio * raio * PI;
        
        System.out.printf("O valor da área é = %.2f \n", area);
        
    }
    
}
