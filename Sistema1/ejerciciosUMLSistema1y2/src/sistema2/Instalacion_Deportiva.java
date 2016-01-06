/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema2;

/**
 *
 * @author Ana Teresa
 */
public class Instalacion_Deportiva {

    private int identificador;
    private String nombre;
    private String localizacion;

    public Instalacion_Deportiva(int identificador, String nombre, String localizacion) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.localizacion = localizacion;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    @Override
    public String toString() {
        return "Instalacion_Deportiva{" + "identificador=" + identificador + ", nombre=" + nombre + ", localizacion=" + localizacion + '}';
    }

}
