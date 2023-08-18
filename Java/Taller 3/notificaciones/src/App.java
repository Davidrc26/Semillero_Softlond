import contracts.INotificacion;
import models.CorreoElectronico;
import models.MensajeDeTexto;
import models.NotificacionPush;

public class App {
    public static void main(String[] args) throws Exception {
        INotificacion notificacionMSJ = new MensajeDeTexto("1234567", "Claro");
        notificacionMSJ.enviarNotificacion("Hola mundo");
        
        INotificacion notificacionCorreo = new CorreoElectronico("david@gmail.com", "otro@gmail.com");
        notificacionCorreo.enviarNotificacion("Hola. ¿Has enviado los documentos?");

        INotificacion notificacionPush = new NotificacionPush("1234567", "Android");
        notificacionPush.enviarNotificacion("Has visto las novedades de nuestra App? Ingresa para conocer más.");
    }
}
