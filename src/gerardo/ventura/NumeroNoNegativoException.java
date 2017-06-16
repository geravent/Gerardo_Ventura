/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerardo.ventura;

/**
 *
 * @author T-
 */
public class NumeroNoNegativoException extends Exception{
  //extends es hija de   
    public NumeroNoNegativoException(){
        super("No puedes meter numeros negativos");
    }
}
