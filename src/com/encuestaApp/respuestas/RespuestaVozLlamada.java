package com.encuestaApp.respuestas;

// Ejemplo de extensión para respuestas de voz en llamadas convencionales
public class RespuestaVozLlamada implements Respuesta {
    private String contenidoVoz;

    // Constructor y métodos específicos para respuestas de voz en llamadas convencionales

    @Override
    public String obtenerContenido() {
        // Implementación específica para obtener el contenido de respuestas de voz en llamadas convencionales
        return contenidoVoz;
    }
}
