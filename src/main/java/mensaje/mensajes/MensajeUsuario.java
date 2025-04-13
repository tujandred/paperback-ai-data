package mensaje.mensajes;

import mensaje.MensajeAI;
import mensaje.TipoMensajeAI;

public class MensajeUsuario extends MensajeAI {
    public MensajeUsuario( String texto) {
        super(TipoMensajeAI.USER, texto);
    }
}
