package contracts;

import models.Cuenta;

public interface ITransaccion {
    public void depositar(double monto);

    public void retirar(double monto);
    
    public void transferir(double monto, Cuenta cuenta);
}