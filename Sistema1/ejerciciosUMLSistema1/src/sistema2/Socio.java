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
public class Socio {

    private String nombre;
    private Direccion direccion;
    private String telefono;
    private int cuota;

    public Socio(String nombre, Direccion direccion, String telefono, int cuota) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cuota = cuota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    @Override
    public String toString() {
        return "Socio{" + "nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", cuota=" + cuota + '}';
    }

}
