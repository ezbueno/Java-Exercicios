package aulas.aula_37;

public class Aula_37 {
    
    public static void main(String[] args) {
        
        TV tv1 = new TV();
        
        System.out.println("A televisão é da marca " + tv1.fabricante + "."
                + " A televisão está " + (tv1.ligado == true? "ligada": 
                "desligada") + ". O volume é " + tv1.volume);
        
        tv1.ligar();
        tv1.aumentarVolume();
        tv1.aumentarVolume();
        
        System.out.println("A televisão é da marca " + tv1.fabricante + "."
                + " A televisão está " + (tv1.ligado == true? "ligada": 
                "desligada") + ". O volume é " + tv1.volume);
        
    }
    
}
