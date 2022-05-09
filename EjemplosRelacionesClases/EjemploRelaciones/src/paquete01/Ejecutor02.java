/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author SALA I
 */
public class Ejecutor02 {

    public static void main(String[] args) {
        String marca = "Toshiba";
        UnidadDVD unidad = new UnidadDVD(marca);

        // se crea el objeto de tipo Computadora
        String procesador = "Intel";

        Computadora computadora = new Computadora(procesador, unidad);

        String variable_marca = computadora.obtenerTipoProcesador();
        UnidadDVD variable_unidad = computadora.obtenerUnidadDvd();
        //String variable_unidad = computadora.obtenerUnidadDvd().obtenerMarca();

        System.out.printf("Computadora:\nProcesador: %s\n"
                + "Unidad de DVD: %s\n",
                variable_marca,
                variable_unidad.obtenerMarca());

    }
}
