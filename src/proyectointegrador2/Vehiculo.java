/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectointegrador2;

/**
 *
 * @author javieraudelo
 */

public class Vehiculo {
    private String idVehiculo;
    private String marca;
    private String modelo;
    private int anio;
    private String placa;

   
    public void registrarVehiculo() {
        System.out.println("Registrando vehículo...");
    }

  public void mostrarVehiculo() {
        System.out.println("ID: " + idVehiculo);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Placa: " + placa);
    }
}










