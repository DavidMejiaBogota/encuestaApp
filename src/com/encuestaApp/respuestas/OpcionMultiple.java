package com.encuestaApp.respuestas;

// Implementación para respuestas de opción múltiple
public class OpcionMultiple implements Respuesta {
    private String contenido;

    // Constructor y métodos específicos para respuestas de opción múltiple

    @Override
    public String obtenerContenido() {
        // Implementación específica para obtener el contenido de respuestas de opción múltiple
        return contenido;
    }
}