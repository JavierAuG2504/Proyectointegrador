/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectointegrador2;

public class GeneradorReporte {
    
    // Atributos
    private String idVehiculo;
    private String idGasolinera;
    private String tipoReporte;

    // Constructor vacío
    public GeneradorReporte() {
    }

    // Constructor con parámetros
    public GeneradorReporte(String idVehiculo, String idGasolinera, String tipoReporte) {
        this.idVehiculo = idVehiculo;
        this.idGasolinera = idGasolinera;
        this.tipoReporte = tipoReporte;
    }

    // Métodos

    public void elegirReporte() {
        System.out.println("Elegir tipo de reporte: " + tipoReporte);
    }

    public void generarReporteCargas() {
        System.out.println("Generando reporte de cargas para vehículo: " + idVehiculo + " en gasolinera: " + idGasolinera);
    }

    public void generarReportePagos() {
        System.out.println("Generando reporte de pagos para vehículo: " + idVehiculo);
    }

    public void generarReporteVales() {
        System.out.println("Generando reporte de vales para vehículo: " + idVehiculo);
    }

    public void mostrarReporte() {
        System.out.println("Mostrando reporte del tipo: " + tipoReporte);
    }
}
