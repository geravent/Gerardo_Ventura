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
public class ValidacionUsuario {
//el throws se puede lanzar la excepcion(tercera persona)
    //static son ls primeras que se generan
    public static void validarNoNegativo(float numero)throws NumeroNoNegativoException{
        //throw primera persona
if(numero<0)throw new NumeroNoNegativoException();
}
}
