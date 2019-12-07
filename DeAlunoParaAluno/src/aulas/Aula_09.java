package aulas;

import java.util.*;

public class Aula_09 {
    
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double base, altura, areaRetangulo;
                
        System.out.println("Informe o valor da área: ");
        base = input.nextDouble();
        
        System.out.println("Informe o valor da altura: ");
        altura = input.nextDouble();
        
        areaRetangulo = base * altura;
        
        System.out.print("A área de um retângulo de base = " + base);
        System.out.println(" e altura " + altura + " é = " + areaRetangulo);
    }
    
}
