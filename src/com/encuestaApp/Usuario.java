package com.encuestaApp;

public abstract class Usuario {
    // Atributos
    protected int idUsuario;
    protected String nombreUsuario;
    protected String apellidoUsuario;
    protected String emailUsuario;
    protected String numeroTelefonoUsuario;
    protected String detallesDemograficos;
    protected String nivelDeUsuario;

    // Constructor
    public Usuario(int idUsuario, String nombreUsuario, String apellidoUsuario, String emailUsuario, String numeroTelefonoUsuario, String detallesDemograficos, String nivelDeUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.emailUsuario = emailUsuario;
        this.numeroTelefonoUsuario = numeroTelefonoUsuario;
        this.detallesDemograficos = detallesDemograficos;
        this.nivelDeUsuario = nivelDeUsuario;
    }

    // Método abstracto
    public abstract void responderEncuesta();
}
