package mensaje.mensajes;

import mensaje.MensajeAI;
import mensaje.TipoMensajeAI;

public class MensajeAsistente extends MensajeAI {
    public MensajeAsistente(String texto) {
        super(TipoMensajeAI.ASSISTANT, texto);
    }
}
