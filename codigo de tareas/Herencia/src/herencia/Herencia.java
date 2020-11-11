/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;


import Clases.Circulo;
import Clases.Cuadrado;
import Clases.Formas;
import Clases.Linea;
import Clases.Triangulo;


public class Herencia{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo cr = new Circulo();
        Linea ln = new Linea();
        Triangulo tr = new Triangulo();
        Cuadrado cd = new Cuadrado();
        Formas fm = new Formas();
        
     fm.ImprimirInformacion(); 
     System.out.println();  
     cr.ImprimirInformacion();
     System.out.println();
     ln.ImprimirInformacion();
     System.out.println();
     tr.ImprimirInformacion();
     System.out.println();
     cd.ImprimirInformacion();
     
     
    }
    
}
