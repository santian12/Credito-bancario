/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;
import logica.SimulacionCredito;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Test;



/**
 *
 * @author santi
 */
public class TestUnitarias {
  
    @Test
    public void crearSoli(){
    SimulacionCredito a = new SimulacionCredito();
    a.crearSoli("1", 0, 0, 0, 0);
 System.out.println(a.crearSoli("pepe", 0, 0, 0, 0));
 
    assertNotNull(true);
    }
 @Test
    public void pago(){
    SimulacionCredito a = new SimulacionCredito();
    a.pago(0, 0, 0);
    assertNotNull(true);
    }
   

}