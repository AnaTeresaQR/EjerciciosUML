/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public class Reservacion {

    private Date fecha;
    private String nombreS;
    private ArrayList<Instalacion_Deportiva> listaInstalaciones;
    private ArrayList<Articulo> listaArticulos;

    public Reservacion(Date fecha, String nombreS) {
        this.fecha = fecha;
        this.nombreS = nombreS;
        initListas();
    }

    /**
     * Inicializa las listas de instalaciones deportivas y de articulos
     */
    private void initListas() {
        listaInstalaciones = new ArrayList<>();
        listaArticulos = new ArrayList<>();
    }

    /**
     * Agrega instalaciones deportivas a la lista
     *
     * @param inst recibe una instalacion deportiva a agregar
     */
    public void agregarInstalaciones(Instalacion_Deportiva inst) {
        listaInstalaciones.add(inst);
    }

    /**
     * Agrega artículos a la lista
     *
     * @param art recibe un articulo para agregar a la lista
     */
    public void agregarArticulo(Articulo art) {
        listaArticulos.add(art);
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

}
