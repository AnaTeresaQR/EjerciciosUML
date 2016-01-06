/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema1;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) {

        Empleado emp1 = new Empleado("pepito", 30, 120000, "Directivo");

        Empleado empSub1 = new Empleado("juan", 45, 110000, "Subordinado");

        Empleado empSub2 = new Empleado("carlos", 50, 90000, "Subordinado");

        Empleado empSub3 = new Empleado("santiago", 56, 16000, "Subordinado");

        emp1.agregarSub(empSub1);
        emp1.agregarSub(empSub2);

        empSub2.agregarSub(empSub3);

        System.out.println("" + emp1.toString());

    }
}
