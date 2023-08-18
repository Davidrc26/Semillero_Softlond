package models;

import contracts.INotificacion;

public class MensajeDeTexto implements INotificacion{

    private String numeroCelular;
    private String companiaCelular;

    public MensajeDeTexto(String numeroCelular, String companiaCelular) {
        this.numeroCelular = numeroCelular;
        this.companiaCelular = companiaCelular;
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando mensaje de texto: " + mensaje + "\n al numero: " + numeroCelular
                + " de la compañia: " + companiaCelular + "\n");
    }

}