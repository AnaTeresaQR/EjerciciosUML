/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema1;

import java.util.ArrayList;

/**
 *
 * @author Ana Teresa
 */
public class Empleado extends Persona {

    private int sueldoBruto;
    private String categoria;
    ArrayList<Empleado> listaSub;

    public Empleado(String nombre, int edad, int sueldoBruto, String categoria) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
        this.categoria = categoria;
        listaSub = new ArrayList<>();
    }

    public void agregarSub(Empleado empleado) {
        listaSub.add(empleado);
    }

    public void eliminarSub(String nombre) {
        for (Empleado empleado : listaSub) {
            if (empleado.getNombre().equals(nombre)) {
                listaSub.remove(empleado);
            }
        }
    }

    public Empleado buscar(String nombre) {
        for (Empleado empleado : listaSub) {
            if (empleado.getNombre().equals(nombre)) {
                return empleado;
            }
        }
        return null;
    }

    public String imprimir() {
        String lista = "";
        for (Empleado listaSubordinado : listaSub) {
            lista += "\n" + listaSubordinado;
        }
        return lista;
    }
}
