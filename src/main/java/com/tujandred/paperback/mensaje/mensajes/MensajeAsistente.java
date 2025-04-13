package com.tujandred.paperback.mensaje.mensajes;

import com.tujandred.paperback.mensaje.MensajeAI;
import com.tujandred.paperback.mensaje.TipoMensajeAI;

public class MensajeAsistente extends MensajeAI {
    public MensajeAsistente(String texto) {
        super(TipoMensajeAI.ASSISTANT, texto);
    }
}
