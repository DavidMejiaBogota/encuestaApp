package com.encuestaApp.respuestas;

// Ampliación de la interfaz Respuesta para adaptarla a diferentes canales de comunicación
public interface Respuesta {
    // Método común para obtener el contenido de la respuesta
    String obtenerContenido();

    // Otros métodos relacionados con las respuestas, comunes para todos los canales
}