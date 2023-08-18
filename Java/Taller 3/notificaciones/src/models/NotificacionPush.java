package models;

import contracts.INotificacion;

public class NotificacionPush implements INotificacion{
    private String token;
    private String plataforma;

    public NotificacionPush(String token, String plataforma){
        this.token = token;
        this.plataforma = plataforma;
    }

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando notificacion push: " + mensaje +"\n al token: " + token + " desde la plataforma: " + plataforma + "\n");
        
    }
    
}
