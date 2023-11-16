package com.encuestaApp.respuestas;

// Ejemplo de extensión para respuestas de texto en el canal de SMS
public class RespuestaTextoSMS implements Respuesta {
    private String contenidoTexto;

    // Constructor y métodos específicos para respuestas de texto en SMS

    @Override
    public String obtenerContenido() {
        // Implementación específica para obtener el contenido de respuestas de texto en SMS
        return contenidoTexto;
    }
}