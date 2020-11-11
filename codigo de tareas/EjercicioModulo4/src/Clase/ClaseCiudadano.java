/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase;

/**
 *
 * Fernando Portillo
 */
public class ClaseCiudadano {
    //nombre del Ciudadano
    private final String nombre;
    
    //edad del Ciudadano
    private int Edad;
    
    //años de experiencia del Ciudadano
    private int AñosExperiencia;
    
    public ClaseCiudadano(String nombre_){
        this.nombre =nombre_;
    }
    public void imprimirElNombre(){
        System.out.println(nombre);
    }
    public void ImprimirEdad(int edad_){
        this.Edad =edad_;    
    }
    public int ValorEdad(){
        return Edad;
    }
    public void ImprimirExperiencia(int Años_de_Experiencia){
        this.AñosExperiencia = Años_de_Experiencia;
    }
    public int ValorExperiencia(){
        return AñosExperiencia;
    }
    
}
