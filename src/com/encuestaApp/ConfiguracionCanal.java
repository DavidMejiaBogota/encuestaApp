package com.encuestaApp;

public class ConfiguracionCanal {
    //Atributos
    private int idCanal;
    private String canal;
    private String parametrosEspecificos; //Se ajsutará el tipo según los detalles especificos necesarios para cada canal.

    //Constructor

    public ConfiguracionCanal(String canal, String parametrosEspecificos) {
        this.canal = canal;
        this.parametrosEspecificos = parametrosEspecificos;
    }
    //Métodos

    //Getters y Setters

    public int getIdCanal() {
        return idCanal;
    }

    public void setIdCanal(int idCanal) {
        this.idCanal = idCanal;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getParametrosEspecificos() {
        return parametrosEspecificos;
    }

    public void setParametrosEspecificos(String parametrosEspecificos) {
        this.parametrosEspecificos = parametrosEspecificos;
    }
}
