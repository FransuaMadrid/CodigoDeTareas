/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parte2;

import Clase.ClaseCiudadano;


public class Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //instanciar la clase Ciudadano
       ClaseCiudadano ciudadano = new ClaseCiudadano("Fernando Portillo");
        ciudadano.imprimirElNombre();
        
        //valor a variable edad
        ciudadano.ImprimirEdad(20);
        
        //imprimir la variable edad
        System.out.println(ciudadano.ValorEdad());
        
        //valor a variable Experiencia
        ciudadano.ImprimirExperiencia(5);
        
        //imprimir variable Experiencia
        System.out.println(ciudadano.ValorExperiencia());
    }
    
}
