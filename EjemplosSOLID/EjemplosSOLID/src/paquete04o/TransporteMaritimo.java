/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04o;

/**
 *
 * @author monkyd
 */
public class TransporteMaritimo extends Transporte{
       String submarino; 
    public void establecerMaritimo(String n) {
        submarino= n;
    }


 
       @Override
    public void establecerTarifa() {
        tarifa = 8.00 + 0.20;
    }

    public String obtenerSubmarino() {
        return submarino;
    }
}
