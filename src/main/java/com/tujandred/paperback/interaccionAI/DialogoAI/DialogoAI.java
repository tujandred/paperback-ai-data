package com.tujandred.paperback.interaccionAI.DialogoAI;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import com.tujandred.paperback.interaccionAI.mensajes.MensajeAI;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


public class DialogoAI {

    @Getter(onMethod_ = {@JsonProperty("instrucciones")})
    @Setter(onMethod_ = {@JsonProperty("instrucciones")})
    private List<MensajeAI> instrucciones = new ArrayList<>();

    @Getter(onMethod_ = {@JsonProperty("mensajes")})
    @Setter(onMethod_ = {@JsonProperty("mensajes")})
    private List<MensajeAI> mensajes = new ArrayList<>();

    public List<MensajeAI> getTodosMensajes() {
        var res = new ArrayList<>(instrucciones);
        res.addAll(mensajes);
        return res;
    }
    //
}
