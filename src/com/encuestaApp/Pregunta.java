package com.encuestaApp;

import java.util.ArrayList;
import java.util.List;

public class Pregunta {
    //Atributos
    private int idPregunta;
    private String tipoPregunta;
    private String contenido;
    private List<String> opcionesRepuesta;

    //Constructor
    public Pregunta(int idPregunta, String tipoPregunta, String contenido) {
        this.idPregunta = idPregunta;
        this.tipoPregunta = tipoPregunta;
        this.contenido = contenido;
        this.opcionesRepuesta = new ArrayList<>();
    }

    //Métodos
    public void editarPregunta(String nuevoContenido) {
        this.contenido = nuevoContenido;
    }
    public void agregarOpcionRespuesta(String opcion) {
        opcionesRepuesta.add(opcion);
    }
    public void eliminarOpcinRespuesta(String opcion) {
        opcionesRepuesta.remove(opcion);
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

    public List<String> getOpcionesRespuesta() {
        return opcionesRepuesta;
    }
    public void setOpcionesRepuesta(List<String> opcionesRepuesta) {
        this.opcionesRepuesta = opcionesRepuesta;
    }

}
