package models;

import contracts.INotificacion;

public class CorreoElectronico implements INotificacion{
    private String direccionCorreoDestino;
    private String direccionCorreoOrigen;

    public CorreoElectronico(String direccionCorreoDestino, String direccionCorreoOrigen){
        this.direccionCorreoDestino = direccionCorreoDestino;
        this.direccionCorreoOrigen = direccionCorreoOrigen;
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando correo electronico: " + mensaje +"\n al correo: " + direccionCorreoDestino + " desde el correo: " + direccionCorreoOrigen + "\n");
    }

    
}
