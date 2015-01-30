/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebas;

import calculadora.Operaciones;
import org.testng.annotations.Test;

/**
 *
 * @author Daniel
 */
public class OperacionesTest {
    @Test
     public void numero() throws ArithmeticException {//metodo para validar si se ha ingresado un numero, recibe una cadena de texto
         Operaciones objeto =  new Operaciones();
         objeto.numero("1","1");

    }
    @Test 
    public void divide() throws ArithmeticException {
        Operaciones objeto =  new Operaciones();
        objeto.Division(1, 1);
       
    }
    @Test
     public void raiz ()throws ArithmeticException{
       Operaciones objeto =  new Operaciones();
        objeto.raiz(2);
    }
    
}
