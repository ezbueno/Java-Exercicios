package aulas;

public class Aula_36 {
    
    public static void main(String[] args) {
        
        double[] v1 = {10.5, 40.2, 15, 22.6, 16};
        double[] v2 = inverterVetor(v1);
        
        for (int i = 0; i < v2.length; i++){
            System.out.println(v2[i]);
        }
    }
    
    public static double[] inverterVetor(double[] vetorA){
        
        double[] vetorB = new double[vetorA.length];
        
        for (int i = 0, j = vetorB.length - 1; i < vetorA.length; i++, j--){
            vetorB[j] = vetorA[i];
        }
        return vetorB;
    }
}
