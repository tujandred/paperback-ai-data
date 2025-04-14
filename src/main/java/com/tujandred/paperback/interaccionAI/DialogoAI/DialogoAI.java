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
    private List<MensajeAI> instrucciones = new ArrayList<>();

    @Getter
    private List<MensajeAI> mensajes = new ArrayList<>();

    public List<MensajeAI> getTodosMensajes() {
        var res = new ArrayList<>(instrucciones);
        res.addAll(mensajes);
        return res;
    }
    //
}
