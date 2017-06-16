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
public class ProbarValidaciones {
    public static void main(String[] args) {
        //Probaremos la excepcion solita
        float x=6;
        try{
        ValidacionUsuario.validarNoNegativo(x);
        }catch(NumeroNoNegativoException e){
            System.out.println(e.getMessage());
        }
    }
        
    
}
