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
public class GerardoVentura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("HOLA MUNDO CRUEL");
        //Probaremos nuestra solucion
        //Crear un usuario hipotetico
        Usuario u=new Usuario();
        //Le asignamos valores
        u.altura=1.68f;
        u.peso=73f;
        //Generamos el modelo
        Imc imc=new Imc();
       
        System.out.println("El valor del imc es"+ imc.calcular(u));
    }
    
}
