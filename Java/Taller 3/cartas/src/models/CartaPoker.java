package models;

public class CartaPoker extends Carta{
    private String valor;

    public CartaPoker(String palo, String valor) {
        super(palo);
        this.valor = valor;
    }

    public int valorNumerico() {
        switch(valor) {
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;
            default:
                return Integer.parseInt(valor);
        }
    }

    String obtenerNombre() {
        return valor;
    }
}
