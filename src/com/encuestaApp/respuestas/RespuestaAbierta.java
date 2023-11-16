package com.encuestaApp.respuestas;

// Implementación para respuestas abiertas
public class RespuestaAbierta implements Respuesta {
    private String contenido;

    // Constructor y métodos específicos para respuestas abiertas

    @Override
    public String obtenerContenido() {
        // Implementación específica para obtener el contenido de respuestas abiertas
        return contenido;
    }
}