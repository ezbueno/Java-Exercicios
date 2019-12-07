package aulas;

public class Aula_35 {
    
    public static void main(String[] args) {
       
        double[] vetorA = {10.2, 34.2, 45.6, 43, 56};
        double[] vetorB = inverterVetor(vetorA);
        
        for (int i = 0; i < vetorB.length; i++){
            System.out.println(vetorB[i]);
        }
        
    }
    
    public static double[] inverterVetor(double[] vetorX){
        
        double[] vetorY = new double[vetorX.length];
        
        for (int i = 0, j = vetorY.length - 1; i < vetorX.length; i++, j--){
            vetorY[j] = vetorX[i];
        }
        return vetorY;
    }
    
}
