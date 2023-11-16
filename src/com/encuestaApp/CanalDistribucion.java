package com.encuestaApp;

import java.util.List;
public class CanalDistribucion {
    //Atributos
    private int idCanalDistibucion;
    private ConfiguracionCanal configuracionCanal;
    //Se incluirían los nuevos atributos necesarios

    //Constructor

    public CanalDistribucion(int idCanalDistibucion, ConfiguracionCanal configuracionCanal) {
        this.idCanalDistibucion = idCanalDistibucion;
        this.configuracionCanal = configuracionCanal;
        //Posteriormente se inicializarían los atributos que se adicionaran
    }

    //Métodos
    public void personalizarMensajes(List<Pregunta> preguntas) {

    }

    //Setter y Getters

    public int getIdCanalDistibucion() {
        return idCanalDistibucion;
    }

    public void setIdCanalDistibucion(int idCanalDistibucion) {
        this.idCanalDistibucion = idCanalDistibucion;
    }

    public ConfiguracionCanal getConfiguracionCanal() {
        return configuracionCanal;
    }

    public void setConfiguracionCanal(ConfiguracionCanal configuracionCanal) {
        this.configuracionCanal = configuracionCanal;
    }
    //Se incluirían los nuevos Getters y Setters que sean necesarios
}
