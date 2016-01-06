/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema2;

import java.util.ArrayList;
import java.util.Calendar;
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

    /**
     * Se encarga de crear una fecha
     *
     * @param dia recibe el diaa crear
     * @param mes recibe el mes a crear
     * @param anno recibe el año a crear
     * @return la fecha creada
     */
    public static Date crearFecha(int dia, int mes, int anno) {
        Calendar c = Calendar.getInstance();
        c.set(anno, mes - 1, dia);
        return c.getTime();
    }

    /**
     * Se encarga de imprimir la lista de instalaciones
     *
     * @return la lista
     */
    private String imprimirIns() {
        StringBuilder res = new StringBuilder();
        for (Instalacion_Deportiva ins : listaInstalaciones) {
            res.append("\n").append(ins.toString());
        }
        return res.toString();
    }

    /**
     * Se encarga de imprimir la lista de articulos
     *
     * @return la lista
     */
    private String imprimirArt() {
        StringBuilder res = new StringBuilder();
        for (Articulo art : listaArticulos) {
            res.append("\n").append(art.toString());
        }
        return res.toString();
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

    @Override
    public String toString() {
        return "Reservacion{" + "fecha=" + getFecha() + ", nombreS=" + nombreS + imprimirIns() + imprimirArt() + '}';
    }

}
