package com.encuestaApp;

import java.util.ArrayList;
import java.util.List;

public class Pregunta extends ElementoEncuesta {
    //Atributos
    private int idPregunta;
    private String tipoPregunta;
    private String contenido;
    private List<Respuesta> respuestas;

    //Constructor
    public Pregunta(int idPregunta, String tipoPregunta, String contenido) {
        this.idPregunta = idPregunta;
        this.tipoPregunta = tipoPregunta;
        this.contenido = contenido;
        this.respuestas = new ArrayList<>();
    }

    //Métodos

    public void agregarRespuesta(Respuesta respuesta) {
        respuestas.add(respuesta);
    }
    public void editarPregunta(String nuevoContenido) {
        this.contenido = nuevoContenido;
    }
    public void eliminarRespuesta(Respuesta respuesta) {
        respuestas.remove(respuesta);
    }

    public void agregarOpcionRespuesta(Respuesta opcion) {
        respuestas.add(opcion);
    }
    public void eliminarOpcinRespuesta(Respuesta opcion) {
        respuestas.remove(opcion);
    }

    //Getter and Setters


    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getTipoPregunta() {
        return tipoPregunta;
    }

    public void setTipoPregunta(String tipoPregunta) {
        this.tipoPregunta = tipoPregunta;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public List<Respuesta> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }
}
