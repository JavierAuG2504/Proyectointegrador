/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectointegrador2;

/**
 *
 * @author javieraudelo
 */
public class Gasolinera {
   private String idGasolinera;
    private String nombre;
    private String direccion;


    public Gasolinera(String idGasolinera, String nombre, String direccion) {
        this.idGasolinera = idGasolinera;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    
    public void registrarGasolinera() {
        System.out.println("Gasolinera registrada:");
        System.out.println("ID: " + idGasolinera);
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
    }
    
    public void mostrarGasolinera() {
        System.out.println("Datos de Gasolinera:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
    }

    public void procesarRegistroCarga() {
        System.out.println("Procesando carga en: " + nombre);
    } 
}
