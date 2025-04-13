package com.tujandred.paperback.interaccionAI.DialogoAI;

import com.tujandred.paperback.interaccionAI.listaMensajes.ListaMensajes;
import com.tujandred.paperback.interaccionAI.mensajes.MensajeInstrucciones;
import lombok.Getter;
import com.tujandred.paperback.interaccionAI.mensajes.MensajeAI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


public class DialogoAI {

    @Getter
    private ListaMensajes instrucciones = new ListaMensajes();

    @Getter
    private ListaMensajes mensajes = new ListaMensajes();

    private ListaMensajes getTodosMensajes() {
        return ListaMensajes.concatenar(instrucciones, mensajes);
    }
}
