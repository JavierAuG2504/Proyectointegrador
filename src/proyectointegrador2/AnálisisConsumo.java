/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectointegrador2;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author javieraudelo
 */
public class AnálisisConsumo extends Thread {
    private List<CargaCombustible> registros;

    public AnálisisConsumo() {
        registros = new ArrayList<>();
    }

    public void run() {
        System.out.println("Análisis de consumo iniciado en un hilo...");
    }
}