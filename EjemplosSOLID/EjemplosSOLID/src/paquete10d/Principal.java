/*
 * 
 * D - Dependency inversion principle (Principio de inversión de dependencias)
 */
package paquete10d;

public class Principal {
    public static void main(String[] args) {
        APIDgo dgo = new APIDgo ();
        dgo.establecerApiKey("Why");
        
         GeneradorPeliculas gp0 = new GeneradorPeliculas();
        gp0.establecerLlave(dgo);
        gp0.establecerUrl("http://api.movie?api=");
        System.out.println(gp0.obtenerUrl());
        
        System.out.println("---------------------------");
        
        
        
        
        APIDisneyPlus di = new APIDisneyPlus ();
        di.establecerApiKey("olamen");
         GeneradorPeliculas gp11 = new GeneradorPeliculas();
        gp11.establecerLlave(di);
        gp11.establecerUrl("http://api.movie?api=");
        System.out.println(gp11.obtenerUrl());
        
        System.out.println("---------------------------");
        
        
        
        APINetflix api = new APINetflix();
        api.establecerApiKey("123455") ;
        
        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");
        System.out.println(gp.obtenerUrl());
        
        System.out.println("---------------------------");
        
        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("123455");
        
        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");
        System.out.println(gp2.obtenerUrl());
        
        
    }
}
