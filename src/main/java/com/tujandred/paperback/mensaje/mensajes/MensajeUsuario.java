package com.tujandred.paperback.mensaje.mensajes;

import com.tujandred.paperback.mensaje.MensajeAI;
import com.tujandred.paperback.mensaje.TipoMensajeAI;

public class MensajeUsuario extends MensajeAI {
    public MensajeUsuario( String texto) {
        super(TipoMensajeAI.USER, texto);
    }
}
