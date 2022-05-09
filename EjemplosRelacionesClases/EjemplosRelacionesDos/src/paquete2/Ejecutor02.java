/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author SALA I
 */
public class Ejecutor02 {

    public static void main(String[] args) {
        //1. Crear una persona del Barrio el Valle de la ciudad de Loja
        //2. Crear una persona del Barrio Central de la ciudad de Cuenca
        //3. Crear una persona del Barrio Centenario de la ciudad de Guayaquil

        Ciudad ciudad1 = new Ciudad("Loja");
        Ciudad ciudad2 = new Ciudad("Cuenca");
        Ciudad ciudad3 = new Ciudad("Guayaquil");

        Barrio barrio1 = new Barrio("El Valle", ciudad1);
        Barrio barrio2 = new Barrio("Central", ciudad2);
        Barrio barrio3 = new Barrio("Centenario", ciudad3);

        Persona persona1 = new Persona("René Elizalde", "1100909909", barrio1);
        Persona persona2 = new Persona("Tais Balcázar", "1150083242", barrio2);
        Persona persona3 = new Persona("Sandra Albán", "1102924063", barrio3);

        System.out.println("------------------------------------------");
        System.out.printf("El barrio de la persona %s (%s) es : %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona1.obtenerNombre(),
                persona1.obtenerCedula(),
                persona1.obtenerBarrio().obtenerNombre(),
                persona1.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");

        barrio2.establecerCiudad(ciudad2);

        System.out.printf("El barrio de la persona %s (%s) es : %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona2.obtenerNombre(),
                persona2.obtenerCedula(),
                persona2.obtenerBarrio().obtenerNombre(),
                persona2.obtenerBarrio().obtenerCiudad().obtenerNombre());
        System.out.println("------------------------------------------");

        barrio3.establecerCiudad(ciudad3);
        System.out.printf("El barrio de la persona %s (%s) es : %s\n Y pertenece a la "
                + "ciudad: %s\n",
                persona3.obtenerNombre(),
                persona3.obtenerCedula(),
                persona3.obtenerBarrio().obtenerNombre(),
                persona3.obtenerBarrio().obtenerCiudad().obtenerNombre());

    }
}
