package exercicios;

import javax.swing.JOptionPane;

public class CalcularMedia {

    public static void main(String[] args) {
        
        String[] n = new String[5];      
        double somaNota = 0, mediaNota = 0;
        int i;
        
    for (i = 0; i <= n.length - 1; i++){
        
        n[i] = JOptionPane.showInputDialog("Qual o valor da " + (i+1) + 
                " ª nota?");
        
        if (Double.parseDouble(n[i]) < 0 || Double.parseDouble(n[i]) > 10){
            JOptionPane.showMessageDialog(null, "Nota inválida!");
            n[i] = JOptionPane.showInputDialog("Qual o valor da " + (i+1) + 
                " ª nota do aluno?");
        }
        
        if (Double.parseDouble(n[i]) >= 0 && Double.parseDouble(n[i]) <= 10){
            somaNota += Double.parseDouble(n[i]);            
        }
    }        
        
        
        if ((mediaNota = somaNota / 5) >= 7){
            JOptionPane.showMessageDialog(null, "A média é = " + mediaNota +
                    " / Aluno Aprovado!");
        } else {
            JOptionPane.showMessageDialog(null, "A média é = " + mediaNota +
                    " / Aluno Reprovado!");            
        }
    }   
}
