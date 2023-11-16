package com.encuestaApp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Encuesta {
    //1. Atributos
    private int idEncuesta;
    private String titulo;
    private String descripcion;
    private int cantidadPreguntas;
    private String canalDistribucion;
    private Date fechaInicio;
    private Date fechaFin;
    private List<String> preguntas;

    //2. Constructor
    public Encuesta(int idEncuesta, String titulo, String descripcion, int cantidadPreguntas, String canalDistribucion, Date fechaInicio, Date fechaFin) {
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
    public void agregarPregunta(String pregunta) {
        preguntas.add(pregunta);
    }

    public void eliminarPregunta(String pregunta) {
        preguntas.remove(pregunta);
    }

    public void programarEncuesta() {
        //logica para programar la encusta
        System.out.println("Encuesta programada para distribución por: "+  canalDistribucion);
    }

    public void generarReporte (){
        //Lógica para generar un reporte de la encuesta
        System.out.println("Generando repoerte de la encuesta" + titulo);
    }

    //Getters y Setters

    //Getters
    public int getIdEncuesta() {
        return idEncuesta;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidadPreguntas() {
        return cantidadPreguntas;
    }

    public String getCanalDistribucion() {
        return canalDistribucion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public List<String> getPreguntas() {
        return preguntas;
    }

    //Setters

    public void setIdEncuesta(int idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidadPreguntas(int cantidadPreguntas) {
        this.cantidadPreguntas = cantidadPreguntas;
    }

    public void setCanalDistribucion(String canalDistribucion) {
        this.canalDistribucion = canalDistribucion;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setPreguntas(List<String> preguntas) {
        this.preguntas = preguntas;
    }
}

