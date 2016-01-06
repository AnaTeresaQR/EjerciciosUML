/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema2;

import java.util.ArrayList;

/**
 *
 * @author Ana Teresa
 */
public class Centro_Deportivo {

    private ArrayList<Socio> socios; // lista de socios

    public Centro_Deportivo() {
        socios = new ArrayList<>();
    }

    /**
     * Se encarga de agregar un socio a la lista
     *
     * @param socio recibe un socio con todos sus datos
     */
    public void agregarSocio(Socio socio) {
        socios.add(socio);
    }

    /**
     * Se encarga de eliminar un socio
     *
     * @param nombre recibe el nombre del socio a eliminar
     */
    public void eliminarSocio(String nombre) {
        for (Socio socio : socios) {
            if (socio.getNombre().equals(nombre)) {
                socios.remove(socio);
            }
        }
    }

    /**
     * Imprime la lista de socios
     *
     * @return lista, devuelve la lista de socios
     */
    public String imprimir() {
        StringBuilder lista = new StringBuilder();
        for (Socio socio : socios) {
            lista.append("\n").append(socio);
        }
        return lista.toString();
    }
}
