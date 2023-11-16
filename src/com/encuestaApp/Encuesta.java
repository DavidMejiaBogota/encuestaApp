package com.encuestaApp;

import com.encuestaApp.respuestas.Respuesta;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Encuesta extends ElementoEncuesta{
    //1. Atributos
    private int idEncuesta;
    private String titulo;
    private String descripcion;
    private int cantidadPreguntas;
    private String canalDistribucion;
    private Date fechaInicio;
    private Date fechaFin;
    private List<Pregunta> preguntas; //Lista de preguntas

    //2. Constructor
    public Encuesta(int idEncuesta, String titulo, String descripcion, int cantidadPreguntas, String canalDistribucion, Date fechaInicio, Date fechaFin, Respuesta respuesta) {
        this.idEncuesta = idEncuesta;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.cantidadPreguntas = cantidadPreguntas;
        this.canalDistribucion = canalDistribucion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.preguntas = new ArrayList<>();
    }
    //3. Métodos
    public void agregarPregunta(Pregunta pregunta) {preguntas.add(pregunta);}

    public void eliminarPregunta(Pregunta pregunta) {
        preguntas.remove(pregunta);
    }

    //Lógica para validación de fechas

    public void programarEncuesta() {
        //logica para programar la encusta
        System.out.println("Encuesta programada para distribución por: "+  canalDistribucion);
    }

    public void setFechaInicio(Date fechaInicio) {
        if (fechaFin != null && fechaInicio.after(fechaFin)) {
            throw new IllegalArgumentException("La fecha de inicio no puede ser posterior a la fecha de fin");
        }
        this.fechaInicio = fechaInicio;
    }
    public void setFechaFin(Date fechaFin) {
        if (fechaInicio != null && fechaFin.before(fechaInicio)) {
            throw new IllegalArgumentException("La fecha fin no puede ser anterior a la fecha de inicio");
        }
        this.fechaFin = fechaFin;
    }
    public void generarReporte (){
        //Lógica para generar un reporte de la encuesta
        System.out.println("Generando repoerte de la encuesta" + titulo);
    }

    //Getters y Setters


    public int getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(int idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadPreguntas() {
        return cantidadPreguntas;
    }

    public void setCantidadPreguntas(int cantidadPreguntas) {
        this.cantidadPreguntas = cantidadPreguntas;
    }

    public String getCanalDistribucion() {
        return canalDistribucion;
    }

    public void setCanalDistribucion(String canalDistribucion) {
        this.canalDistribucion = canalDistribucion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }
}

