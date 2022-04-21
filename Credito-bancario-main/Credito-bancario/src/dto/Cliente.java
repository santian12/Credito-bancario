/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.io.Serializable;


/**
 *
 * @author santi
 */
public class Cliente implements Serializable{
   private String Nombre;
   private int Identificacion;
   private float Dinero;
   private int Meses;
  private double Interes;
  private String Codigo;
  private double pagoMensual;
  
  
  public double getPago(){
return this.pagoMensual;
}
  public void setPago(double pagoMensual){
  this.pagoMensual=pagoMensual;
  }
  
  public String getCodigo(){
  return this.Codigo;
  
  }
  public void setCodigo(String codigo){
  this.Codigo=codigo;
  }
  
  public double obtenerInteres(){
 return this.Interes;
}
  
     public String obtenerNombre(){
        return this.Nombre;
    }
    public int obtenerIdentificacion(){
        return this.Meses;
    }
      public int obtenerMeses(){
        return this.Identificacion;
    }
    
    public float obtenerDinero(){
        return this.Dinero;
    }
    
    public void modificaNombre(String nombre){
        this.Nombre = nombre;
    }
    public void modificaIdentificacion(int identificacion){
        this.Identificacion = identificacion;
    }
    public void modificaMeses(int Meses){
        this.Meses = Meses;
    }
  public void modificaDinero(float dinero){
        this.Dinero = dinero;
    }
  public void modificaInteres(double interes){
        this.Interes = interes;
    }

    @Override
    public String toString() {
        return " El nombre del cliente es: "+obtenerNombre()+ " Su dientificacion es:  "
     +this.Identificacion+"El monto que estued desea que le presenten es de:"+obtenerDinero()+"El numero de meses en que usted va pagar es:"
                +obtenerMeses()+obtenerInteres();
    }

    
   
}
