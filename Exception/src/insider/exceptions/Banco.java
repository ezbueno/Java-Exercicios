package insider.exceptions;

public class Banco {
    
    public void realizarOperacao(){
        ContaBancaria c = new ContaBancaria();  
        
        try {
            c.sacar(100);
            System.out.println("Saque realizado.");
            
            double saldo = c.getSaldo();
            System.out.println("Saldo Atual");
            System.out.println(saldo);  
            
        } catch (ValorInvalidoException | SaldoInsuficienteException e){
            System.out.println("ERRO! O valor informado é inválido ou não há "
                    + "saldo suficiente para saque. " + e.getMessage());
            
        } finally {
            System.out.println("Fim do Saque");
        }
        
      
    }
    
}
