/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


public class Clase_padre_Formas {
    protected String EstablecerDibujo;    
    protected String EstablecerColor;
    protected String Calculararea;
    protected String Calcularradio;
    

    public Clase_padre_Formas() {
}
    
   public void NombreDeLaFigura(String nombre){
       this.EstablecerDibujo = nombre;
   }
   public String ObtenerDibujo (){
   return this.EstablecerDibujo;
   }   
   public void Color(String color){
       this.EstablecerColor = color;
   }   
   public String Color(){
       return this.EstablecerColor;
   }
    public void Area(String A){
       this.Calculararea = A;
   }  
   public String Area(){
       return this.Calculararea;
   }
   public void Radio(String R){
       this.Calcularradio = R;  
   }
   public String Radio (){
   return this.Calcularradio;
   }
   
   public void ImprimirInformacion(){
       System.out.println("Nombre: "+ EstablecerDibujo);
       System.out.println("Radio: "+ Calcularradio);
       System.out.println("Area: "+ Calculararea);
       System.out.println("Color: "+ EstablecerColor);
   }
   
}