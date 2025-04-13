package com.tujandred.paperback.interaccionAI.mensajes;

public class MensajeInstrucciones extends MensajeAI {

    public MensajeInstrucciones(String texto) {
        super(TipoMensajeAI.SYSTEM, texto);
    }
}
