package com.tujandred.paperback.interaccionAI.mensajes;

public class MensajeUsuario extends MensajeAI {
    public MensajeUsuario( String texto) {
        super(TipoMensajeAI.USER, texto);
    }
}
