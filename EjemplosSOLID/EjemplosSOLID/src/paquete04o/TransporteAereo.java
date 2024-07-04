/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04o;

/**
 *
 * @author monkyd
 */
public class TransporteAereo extends Transporte {
    String avion;
    
    
    public void establecerAvion(String n) {
        avion = n;
    }


    @Override
    public void establecerTarifa() {
        tarifa = 2.00 + 0.20;
    }

    public String obtenerAvion() {
        return avion;
    }

}
