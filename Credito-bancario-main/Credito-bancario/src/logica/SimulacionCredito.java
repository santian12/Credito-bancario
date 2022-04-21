/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import Utlidades.GestorPersistencia;
import dto.Cliente;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author santi
 */
public class SimulacionCredito {
   
       public Cliente crearSoli(String nombre, int identificacion, float dinero, int meses){
           
         if ( nombre == null   || nombre.isEmpty() ){
               
            return null;
        }
         
         else{
            
              Cliente s = new Cliente();
             s.modificaNombre(nombre);
             s.modificaDinero(dinero);
             s.modificaIdentificacion(identificacion);
             s.modificaMeses(meses);

        if(meses >=0 && meses <=6){
   
            
               s.modificaInteres(1.5);      
        
       }
       else if(meses >6 && meses <12){
          
                   s.modificaInteres(2.5);  
                   
         }
       else if(meses>=12 && meses<24){
                     s.modificaInteres(3.5);  
                   
       }
       else if(meses >=24){
                   s.modificaInteres(4.5);  
                    
       }
         double valorInteres = s.obtenerDinero()*s.obtenerInteres();
         double total = s.obtenerDinero()+valorInteres;
         s.setPago(total / s.obtenerMeses());
    
          
                 
        listaCreditos.put(s.getCodigo(), s);
       GestorPersistencia.guardar(listaCreditos);
        return s  ;
         }
     //double  valorInteres = s.obtenerDinero() * s.obtenerInteres();
       //          double   total = s.obtenerDinero() + valorInteres;
         //          double pagoMensual = total /   s.obtenerMeses();
      

    }
      
          
                   
  
       
   private Map<String, Cliente> listaCreditos;
     public SimulacionCredito(){
        if (listaCreditos == null){
            listaCreditos = (Map<String, Cliente> )GestorPersistencia.recuperar();
            if (listaCreditos == null){
                listaCreditos = new HashMap<>();
            }
        }
    }
     public Map<String, Cliente> obtenerLista(){
        return this.listaCreditos;
    }
        }


