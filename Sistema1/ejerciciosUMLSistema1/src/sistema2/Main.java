/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema2;

import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public class Main {
    
    public static void main(String[] args) {
        
        Direccion d1 = new Direccion("i km al norte", "Buenos Aires", "Palmares", "Alajuela");
        
        Socio s1 = new Socio("Ana", d1, "87518238", 10000);
        
        Centro_Deportivo centro = new Centro_Deportivo();
        
        centro.agregarSocio(s1);
        
        Instalacion_Deportiva ins1 = new Instalacion_Deportiva(1, "pista de hielo", "cerca de las flores");
        
        Articulo art1 = new Articulo(1, "patines", 2);
        
        Reservacion r1 = new Reservacion(Reservacion.crearFecha(29, 6, 2016), s1.getNombre());
        
        r1.agregarInstalaciones(ins1);
        r1.agregarArticulo(art1);
        
        ManejadorReservacion manejoR = new ManejadorReservacion();
        manejoR.agregarReservacion(r1);
        
        System.out.println("" + manejoR.imprimir());
        
        
    }
    
}
