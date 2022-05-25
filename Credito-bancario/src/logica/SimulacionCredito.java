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
   private Map<String, Cliente> listaCreditos;
    public SimulacionCredito(){
        if (listaCreditos == null){
            listaCreditos = (Map<String, Cliente> )GestorPersistencia.recuperar();
            if (listaCreditos == null){
                listaCreditos = new HashMap<>();
            }
        }
    }
       public Cliente crearSoli(String nombre, int identificacion, float dinero, int meses, double interes){
           
         if ( nombre == null   || nombre.isEmpty() ){
               
            return null;
        }
         
         else{
            
             
             
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
     
               
        Cliente s = new Cliente();
             s.modificaNombre(nombre); 
             s.modificaIdentificacion(identificacion);
             s.modificaDinero(dinero);
              s.modificaInteres(interes);
             s.modificaMeses(meses);
            
        
        listaCreditos.put(s.getCodigo(),s);
          GestorPersistencia.guardar(listaCreditos);
          return s;
         }
         
       }
       
        public double pago(double dinero, double interes,double meses){
          double  valorInteres = dinero * interes;
                 double   total = dinero + valorInteres;
                 double pagoMensual = total / meses;  
                  double Saldo= total-pagoMensual;
                 
        return pagoMensual + Saldo;
        }
       public Map<String,Cliente>ObtenerLista(){
       return this.listaCreditos;
       }

    public void crearSoli(String pepe, String g, String g0, String g1, String g2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
        }
           
           
      
        
       

        


