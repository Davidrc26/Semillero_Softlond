package models;

import java.util.ArrayList;

public class Baraja {
    private ArrayList<Carta> cartas;

    public Baraja() {
        cartas = new ArrayList<>();
        String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String palo : palos) {
            for (String valor : valores) {
                cartas.add(new CartaPoker(palo, valor));
            }
        }
    }

    public void mostrarBaraja() {
        for (Carta carta : cartas) {
            carta.mostrarCarta();
        }
    }
}
