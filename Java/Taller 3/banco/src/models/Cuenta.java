package models;

import contracts.ITransaccion;

public abstract class Cuenta implements ITransaccion{
    private double saldo;

    public Cuenta(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        if(saldo < 0){
            throw new IllegalArgumentException("Saldo no puede ser negativo");
        }
        this.saldo = saldo;
    }


}
