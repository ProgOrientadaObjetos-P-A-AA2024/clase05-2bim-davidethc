/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06l;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
           Banco ban = new Banco ("Banco-Loja");
        TarjetaCredito t1 = new TarjetaCredito();
        
      
        t1.establecerNombre("juan");
        t1.establecerNumero(12345);
        t1.establecerBanco(ban);
     
          MayorEdad representante = new MayorEdad("José", t1);
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        
        
        System.out.printf("Nombre:%s - Tarjeta:%s-Banco:%s\n",
                menor.obtenerNombre(), 
                menor.obtenerRepresentante().obtenerTarjeta().obtenerNumero(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerBanco());
        
    }
}
