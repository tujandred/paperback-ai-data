package mensaje;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;

@Data
@AllArgsConstructor
public class MensajeAI {
    String texto;
    Instant timeStamp;
    //Comentario de prueba para forzar el refresco
}
