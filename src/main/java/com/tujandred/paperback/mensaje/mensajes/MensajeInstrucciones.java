package com.tujandred.paperback.mensaje.mensajes;

import com.tujandred.paperback.mensaje.MensajeAI;
import com.tujandred.paperback.mensaje.TipoMensajeAI;

public class MensajeInstrucciones extends MensajeAI {

    public MensajeInstrucciones(String texto) {
        super(TipoMensajeAI.SYSTEM, texto);
    }
}
