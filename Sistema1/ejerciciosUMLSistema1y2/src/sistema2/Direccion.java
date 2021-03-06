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
public class Direccion {

    private String direccionExacta;
    private String distrito;
    private String canton;
    private String provincia;

    public Direccion(String direccionExacta, String distrito, String canton, String provincia) {
        this.direccionExacta = direccionExacta;
        this.distrito = distrito;
        this.canton = canton;
        this.provincia = provincia;
    }

    public String getDireccionExacta() {
        return direccionExacta;
    }

    public void setDireccionExacta(String direccionExacta) {
        this.direccionExacta = direccionExacta;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Direccion{" + "direccionExacta=" + direccionExacta + ", distrito=" + distrito + ", canton=" + canton + ", provincia=" + provincia + '}';
    }

}
