package models;
import contracts.ICarta;

public abstract class Carta implements ICarta {
    protected String palo;

    public Carta(String palo) {
        this.palo = palo;
    }

    public void mostrarCarta() {
        System.out.println("[" + obtenerNombre() + " de " + palo + "]");
    }

    abstract String obtenerNombre();
}
