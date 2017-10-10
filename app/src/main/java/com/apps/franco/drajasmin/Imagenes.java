package com.apps.franco.drajasmin;

/**
 * Created by Franco on 6/07/17.
 */

public class Imagenes {

    private int Imagen;
    private String tratamiento;

    public Imagenes(int imagen, String tratamiento) {
        Imagen = imagen;
        this.tratamiento = tratamiento;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
}
