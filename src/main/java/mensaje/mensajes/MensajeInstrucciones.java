package mensaje.mensajes;

import mensaje.MensajeAI;
import mensaje.TipoMensajeAI;

public class MensajeInstrucciones extends MensajeAI {

    public MensajeInstrucciones(String texto) {
        super(TipoMensajeAI.SYSTEM, texto);
    }
}
