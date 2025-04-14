package com.tujandred.paperback.interaccionAI.mensajes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MensajeAI {
    UUID uuid = UUID.randomUUID();
    TipoMensajeAI tipo;
    String texto;
    Instant timeStamp = Instant.now();

    public MensajeAI(TipoMensajeAI tipo, String texto) {
        this.tipo = tipo;
        this.texto = texto;
        uuid = UUID.randomUUID();
        timeStamp = Instant.now();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        MensajeAI that = (MensajeAI) o;
        return uuid.equals(that.uuid);
    }

    @Override
    public int hashCode() {
        return uuid.hashCode();
    }


}
