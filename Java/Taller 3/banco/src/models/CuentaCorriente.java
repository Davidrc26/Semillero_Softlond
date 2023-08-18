package models;

public class CuentaCorriente extends Cuenta{

    public CuentaCorriente(double saldo) {
        super(saldo);
        
    }

    @Override
    public void depositar(double monto) {
         super.setSaldo(super.getSaldo() + monto);
    }

    @Override
    public void retirar(double monto) {
        if(monto > super.getSaldo()){
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        super.setSaldo(super.getSaldo() - monto);
    }

    @Override
    public void transferir(double monto, Cuenta cuenta) {
        if(monto > super.getSaldo()){
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        super.setSaldo(super.getSaldo() - monto);
        cuenta.depositar(monto);
    }
    
}
