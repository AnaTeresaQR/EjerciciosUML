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

    private String imprimir() {
        String lista = "";
        if (listaSub.isEmpty()) {
            lista += "\n******Lista de subordinados de: " + Empleado.super.getNombre() + " vacía******\n";
        } else {
            for (Empleado listaSubordinado : listaSub) {
                lista += "\n\n\t--->  " + listaSubordinado;
            }
        }
        return lista;
    }

    @Override
    public String toString() {
        return super.toString() + ", sueldo bruto: " + sueldoBruto + "\n.........Categoría........." + categoria + imprimir();
    }

}
