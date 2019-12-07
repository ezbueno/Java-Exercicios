package insider.exceptions;

public class ContaBancaria {
    
    private double saldo = 1000;
    
    public void sacar(double valor) throws ValorInvalidoException,
                                           SaldoInsuficienteException {
               
        if (valor <= 0){
            throw new ValorInvalidoException("O valor " + valor + 
                    " é inválido para saque!");
        }
        
        if (saldo - valor < 0){
            throw new SaldoInsuficienteException("Saldo disponível para saque: "
            + " R$ " + saldo);
        }
        
        saldo -= valor;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
}
