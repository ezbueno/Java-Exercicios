package aulas;

public class Aula_29 {
    
    public static void main(String[] args) {
        
        int i, j, aux;
        int[] x = {5, 10, 23, 45, 30, 2, 9, 1, 89, 15};
        boolean controle;
        
        for (i = 0; i < x.length - 1; i++){
            controle = true;
            for (j = i + 1; j < x.length; j++){
                if (x[i] > x[j]){
                    aux = x[i];
                    x[i] = x[j];
                    x[j] = aux;
                    controle = false;
                }
            }
            if (controle){
                break;
            }
        }
            
        System.out.println("Números ordenados:");
        
        for (i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }
        
    }
    
}
