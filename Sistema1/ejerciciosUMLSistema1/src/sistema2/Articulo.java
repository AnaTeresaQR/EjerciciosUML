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
public class Articulo {

    private int identificador;
    private String nombreArt;
    private int estante;

    public Articulo(int identificador, String nombreArt, int estante) {
        this.identificador = identificador;
        this.nombreArt = nombreArt;
        this.estante = estante;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombreArt() {
        return nombreArt;
    }

    public void setNombreArt(String nombreArt) {
        this.nombreArt = nombreArt;
    }

    public int getEstante() {
        return estante;
    }

    public void setEstante(int estante) {
        this.estante = estante;
    }

    @Override
    public String toString() {
        return "Articulo{" + "identificador=" + identificador + ", nombreArt=" + nombreArt + ", estante=" + estante + '}';
    }

}
