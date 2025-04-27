/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectointegrador2;

/**
 *
 * @author javieraudelo
 */
public class CargaCombustible {
   private String idCarga;
    private String fecha;
    private double cantidadLitros;
    private double precioPorLitro;
    private double precioTotal;
    private String idVehiculo;
    private String idGasolinera;


    public double calcularPrecioTotal() {
        precioTotal = cantidadLitros * precioPorLitro;
        return precioTotal;
    }

  public void registrarCarga() {
        System.out.println("Carga registrada:");
        System.out.println("ID Carga: " + idCarga);
        System.out.println("Fecha: " + fecha);
        System.out.println("Cantidad de Litros: " + cantidadLitros);
        System.out.println("Precio por Litro: " + precioPorLitro);
//duda como hacer el precio total para mostrar aquí 
        System.out.println("ID Vehículo: " + idVehiculo);
        System.out.println("ID Gasolinera: " + idGasolinera);
    }
}