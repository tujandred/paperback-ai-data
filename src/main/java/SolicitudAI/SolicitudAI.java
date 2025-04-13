package SolicitudAI;

import lombok.Getter;
import mensaje.MensajeAI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


public class SolicitudAI {

    @Getter
    private List<MensajeAI> historia = new ArrayList<>();

    public void anyadir(MensajeAI mensajeAI) {
        historia.add(mensajeAI);
    }

    public Optional<MensajeAI> masReciente() {
        return Optional.ofNullable(historia.getLast());
    }

    public int posicion(MensajeAI mensajeAI) {
        return historia.indexOf(mensajeAI);
    }

    public int posicion(UUID uuid) {
        for (int pos = 0; pos < historia.size(); pos++) {
            var m = historia.get(pos);
            if (m.equals(uuid)) {
                return pos;
            }
        }
        return -1;
    }

    public void borrar(MensajeAI mensajeAI) {
        var pos = posicion(mensajeAI);
        if (pos >= 0) {
            historia.remove(pos);
        }
    }

    public Optional<MensajeAI> obtener(UUID uuid) {
        var pos = posicion(uuid);
        if (pos >= 0) {
            return Optional.of(historia.get(pos));
        } else {
            return Optional.empty();
        }
    }
}
