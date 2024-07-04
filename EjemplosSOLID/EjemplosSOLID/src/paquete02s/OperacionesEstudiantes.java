/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02s;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {
    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private int edadminima;
    private int edadmaxima;
    private String listaCiudadesEstudiantes;
    // Una Persona, tiene un atributo ciudad de tipo Ciudad
    // Una Ciudad, tiene un atributo nombre de tipo String
    
    
    
    public void establecerEdadMinima(){
        edadminima = 100;
        for(int i =0;i<estudiantes.size();i++){
            if(estudiantes.get(i).obtenerEdad()<edadminima){
                edadminima = estudiantes.get(i).obtenerEdad();
            }
        }
    }
    
        public void establecerEdadMaxima(){
        edadmaxima = -100;
        for(int i =0;i<estudiantes.size();i++){
            if(estudiantes.get(i).obtenerEdad()>edadmaxima){
                edadmaxima = estudiantes.get(i).obtenerEdad();
            }
        }
    }
    public void establecerListaCiudadesEstudiantes(){
        String cadena="";
        for(int i =0;i<estudiantes.size();i++){
            cadena=String.format("%s%s\n" ,cadena,estudiantes.get(i).getCiudad().obtenerNombre());
        }
listaCiudadesEstudiantes= cadena;
                
                
                
                
                
                
                
                
                
                
    }
    
    
    
    public void establecerEstudiante(ArrayList<Persona> lista){
        estudiantes = lista;
    }
    
    public ArrayList<Persona> obtenerEstudiante(){
        return estudiantes;
    }
    
    public void establecerPromedioEdades(){
        double suma = 0;
        for(Persona e: obtenerEstudiante()){
            suma = suma + e.obtenerEdad();
        }
        promedioEdades = suma/obtenerEstudiante().size();
    }
    
    public double obtenerPromedioEdades(){
        
        return promedioEdades;
    }

    public int getEdadminima() {
        return edadminima;
    }

    public int getEdadmaxima() {
        return edadmaxima;
    }

    public String getListaCiudadesEstudiantes() {
        return listaCiudadesEstudiantes;
    }
    @Override
   public String toString() {
        String cadena;
        return cadena = String.format("Promedio de edad: %.2f\n"
                + "Edad minima: %d\n"
                + "Edad maxima: %d\n"
                + "Lista de Ciudades: \n%s\n", obtenerPromedioEdades(),
                getEdadminima(),  getEdadmaxima(), getListaCiudadesEstudiantes());
    }
    
    
}
