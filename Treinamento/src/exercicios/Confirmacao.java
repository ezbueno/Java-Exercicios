package exercicios;

import javax.swing.JOptionPane;

public class Confirmacao {

    public static void main(String[] args) {
        
        String qtdeCarro = JOptionPane.showInputDialog("Digite a quantidade "
                + "de carros: ");
        
        String qtdePessoa = JOptionPane.showInputDialog("Digite a quantidade " 
                + "de pessoas: ");
        
        int numCarro = Integer.parseInt(qtdeCarro);
        int numPessoa = Integer.parseInt(qtdePessoa);
        
        int divisao = numCarro / numPessoa;
        int resto = numCarro % numPessoa;
        
                
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver a " +
                "divisão?");
        
        if (resposta == 0){
            JOptionPane.showMessageDialog(null, "Valor da divisão: " + divisao);                  
        } else {
            JOptionPane.showMessageDialog(null, "Não quis ver o resultado da " +
                    "divisão.");
        }

        resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto " +
                "divisão?");        
         
        if (resposta == 0){
            JOptionPane.showMessageDialog(null, "Resto da divisão: " + resto);
        } else {
            JOptionPane.showMessageDialog(null, "Não quis ver o resto da " +
                    "divisão.");                    
        }
        
    }
    
}
