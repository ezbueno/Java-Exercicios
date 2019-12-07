package aulas;

public class Aula_13 {
    
    public static void main (String[] args){
        
        long totalMilissegundos = System.currentTimeMillis() - 10800000;
        
        long totalSegundos = totalMilissegundos / 1000;
        long segundoAtual = totalSegundos % 60;
        
        long totalMinutos = totalSegundos / 60;
        long minutoAtual = totalMinutos % 60;
        
        long totalHora = totalMinutos / 60;
        long horaAtual = totalHora % 24;
        
        System.out.println(horaAtual + ":" + minutoAtual + ":" + segundoAtual);
        
    }
    
}
