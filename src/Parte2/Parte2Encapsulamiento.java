/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parte2;

import Clase.ClaseCiudadano;


public class Parte2Encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //ClaseCiudadano
       ClaseCiudadano ciudadano = new ClaseCiudadano("Fernando Portillo");
        ciudadano.imprimirElNombre();
        
        //Edad
        ciudadano.ImprimirEdad(20);
        
        //ImprimirEdad
        System.out.println(ciudadano.ValorEdad());
        
        //Experiencia
        ciudadano.ImprimirExperiencia(3);
        
        //ImprimirExperiencia
        System.out.println(ciudadano.ValorExperiencia());
    }
    
}
