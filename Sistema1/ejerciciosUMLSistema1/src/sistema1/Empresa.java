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
public class Empresa {

    private String nombre;
    private String direccion;
    private String telefono;

    ArrayList<Empleado> listaEmpleados;

    public Empresa(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        listaEmpleados = new ArrayList<>();
    }

    public void agregarEmp(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

    public void eliminarEmp(Empleado empleado) {
        listaEmpleados.remove(empleado);
    }

    public Empleado buscarEmp(String nombre) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getNombre().equals(nombre)) {
                return empleado;
            }
        }
        return null;
    }

    public String imprimirEmp() {
        String lista = "";
        for (Empleado listaEmpleado : listaEmpleados) {
            lista += "\n" + listaEmpleado;
        }
        return lista;
    }
}
