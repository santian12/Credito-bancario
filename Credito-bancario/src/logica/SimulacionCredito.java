/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import dto.Cliente;
/**
 *
 * @author santi
 */
public class SimulacionCredito {
   
       public Cliente crearSoli(String nombre, int identificacion, float dinero, int meses, double interes){
           
         if ( nombre == null   || nombre.isEmpty() ){
               
            return null;
        }
         
         else{
            
              Cliente s = new Cliente();
             s.modificaNombre(nombre);
             s.modificaDinero(dinero);
             s.modificaIdentificacion(identificacion);
             s.modificaMeses(meses);
             s.modificaInteres(interes);
             
        if(meses >=0 && meses <=6){
   
            interes = 1.5;
                    
        
       }
       else if(meses >6 && meses <12){
             interes =2.5;
                    
                   
         }
       else if(meses>=12 && meses<24){
                     interes =3.5;
                   
       }
       else if(meses >=24){
                   interes =4.5;
                    
       }
     
               double  valorInteres = dinero * interes;
                 double   total = dinero + valorInteres;
                   double pagoMensual = total / meses;
       
        return s;
    }
       }
       
           
           
      
        
       

        }


