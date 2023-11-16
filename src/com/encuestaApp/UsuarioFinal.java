package com.encuestaApp;

public class UsuarioFinal extends Usuario {
    // Constructor
    public UsuarioFinal(int idUsuario, String nombreUsuario, String apellidoUsuario, String emailUsuario, String numeroTelefonoUsuario, String detallesDemograficos, String nivelDeUsuario) {
        super(idUsuario, nombreUsuario, apellidoUsuario, emailUsuario, numeroTelefonoUsuario, detallesDemograficos, nivelDeUsuario);
    }

    @Override
    public void responderEncuesta() {

    }

    // No se agregan métodos adicionales ya que hereda todo de Usuario.
}
