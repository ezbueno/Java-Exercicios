package aulas;

import java.util.Scanner;

public class Aula_33 {
    
    public static void main(String[] args) {
    
    double areaRetangulo, base, altura;
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o valor da base: ");
        base = input.nextDouble();
        
        System.out.println("Informe o valor da altura: ");
        altura = input.nextDouble();
        
        areaRetangulo = retangulo(base, altura);
        System.out.println(areaRetangulo);
  
 }
 
    public static double retangulo(double base, double altura){

           return base * altura;
    }
}