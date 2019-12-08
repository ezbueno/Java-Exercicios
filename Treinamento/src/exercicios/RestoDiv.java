package exercicios;

import javax.swing.JOptionPane;

public class RestoDiv {

    public static void main(String[] args) {
        
        String qtdeCarro = JOptionPane.showInputDialog("Digite a quantidade "
                + "de carros: ");
        
        String qtdePessoa = JOptionPane.showInputDialog("Digite a quantidade " 
                + "de pessoas: ");
        
        int numCarro = Integer.parseInt(qtdeCarro);
        int numPessoa = Integer.parseInt(qtdePessoa);
        
        int divisao = numCarro / numPessoa;
        int resto = numCarro % numPessoa;
        
        JOptionPane.showMessageDialog(null, numPessoa + " pessoa(s) "
        + "recebeu/receberam " + divisao + " carro(s). Restou/Restaram apenas "
                + resto + " carro(s)");        
    }
    
}
