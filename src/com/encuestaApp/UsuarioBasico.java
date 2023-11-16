package com.encuestaApp;

public class UsuarioBasico extends Usuario {
    // Constructor
    public UsuarioBasico(int idUsuario, String nombreUsuario, String apellidoUsuario, String emailUsuario, String numeroTelefonoUsuario, String detallesDemograficos, String nivelDeUsuario) {
        super(idUsuario, nombreUsuario, apellidoUsuario, emailUsuario, numeroTelefonoUsuario, detallesDemograficos, nivelDeUsuario);
    }

    @Override
    public void responderEncuesta() {

    }

    // Métodos adicionales
    public void registrarse() {
        // Implementación
    }

    public void iniciarSesion() {
        // Implementación
    }

    public void recuperarContrasenia() {
        // Implementación
    }

    public void cerrarSesion() {
        // Implementación
    }

    // Otros métodos adicionales según tu requerimiento
}
