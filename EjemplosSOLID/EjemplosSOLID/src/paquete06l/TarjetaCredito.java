/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06l;

/**
 *
 * @author monkyd
 */
public class TarjetaCredito {
    String nombre;
    int numero;

    public TarjetaCredito(String nombre1, int numero1) {
        nombre = nombre1;
        numero = numero1;
    }
public TarjetaCredito(){
    
}
    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerNumero(int numero) {
        this.numero = numero;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerNumero() {
        return numero;
    }
    
    
    
}
