package com.tujandred.paperback.interaccionAI.listaMensajes;

import com.tujandred.paperback.interaccionAI.mensajes.MensajeAI;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

public class ListaMensajes extends ArrayList<MensajeAI> {
    public void borrarTodo() {
        clear();
    }

    public int posicion(MensajeAI mensajeAI) {
        return indexOf(mensajeAI);
    }

    public int posicion(UUID uuid) {
        for (int pos = 0; pos < size(); pos++) {
            var m = get(pos);
            if (m.equals(uuid)) {
                return pos;
            }
        }
        return -1;
    }

    public void borrar(MensajeAI mensajeAI) {
        var pos = posicion(mensajeAI);
        if (pos >= 0) {
            remove(pos);
        }
    }

    public Optional<MensajeAI> obtener(UUID uuid) {
        var pos = posicion(uuid);
        if (pos >= 0) {
            return Optional.of(get(pos));
        } else {
            return Optional.empty();
        }
    }

    public Optional<MensajeAI> masReciente() {
        return Optional.ofNullable(getLast());
    }

    public void anyadir(MensajeAI mensajeAI) {
        add(mensajeAI);
    }

    public void anyadirDelante(MensajeAI mensajeAI){
        addFirst(mensajeAI);
    }

    public void anyadirPos(MensajeAI mensajeAI, int pos) {
        add(pos, mensajeAI);
    }

    public static ListaMensajes concatenar(ListaMensajes... listas ) {
        ListaMensajes res = new ListaMensajes();
        for (ListaMensajes l: listas) {
            res.addAll(l);
        }
        return res;
    }
}
