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
public class ManejadorReservacion {

    private ArrayList<Reservacion> reservaciones;

    public ManejadorReservacion() {
        reservaciones = new ArrayList<>();
    }

    /**
     * Se encarga de agregar una reservacion a la lista
     *
     * @param reservacion, recibe la reservacion a agregar en la lista
     */
    public void agregarReservacion(Reservacion reservacion) {
        reservaciones.add(reservacion);
    }

    /**
     * Se encarga de imprimir la lista de reservaciones
     * @return la lista
     */
    public String imprimir() {
        StringBuilder res = new StringBuilder();
        for (Reservacion reservacione : reservaciones) {
            res.append("\n").append(reservacione.toString());
        }
        return res.toString();
    }
}
