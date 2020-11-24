package Convertidor;

public class Convertidor {
    protected double ValorCantidad, Resultado;
    protected float MonedaDeOrigen, MonedaDeSalida;

    
    

    public double getValor() {
        return ValorCantidad;
    }

    public void setValor(double Valor) {
        this.ValorCantidad = Valor;
    }

    public int getMonedaDeOrigen() {
        return (int) MonedaDeOrigen;
    }

    public void setMonedaDeOrigen(int MonedaDeOrigen) {
        this.MonedaDeOrigen = MonedaDeOrigen;
        
    }

    public int getMonedaDeSalida() {
        return (int) MonedaDeSalida;
    }

    public void setMonedaDeSalida(int MonedaDeSalida) {
        this.MonedaDeSalida = MonedaDeSalida;
    }


    
    public double getResultado() {
        return Resultado;
    }

    public void setResultado(double Resultado) {
        this.Resultado = Resultado;
    }
    
    
//Constructor

  
    public double Convertir(){
         
            
        if(MonedaDeOrigen==0 && MonedaDeSalida==1){
            return Resultado = (ValorCantidad) * (24);
        }
            
            
            if(MonedaDeOrigen==1 && MonedaDeSalida==0){
                return Resultado =(ValorCantidad) * (0.4);
            }
            
            
                    else if(MonedaDeOrigen==1 && MonedaDeSalida==1 && MonedaDeOrigen==0 && MonedaDeSalida==0){
                         Resultado=(ValorCantidad);
                    }
        return Resultado;
            
        }
}