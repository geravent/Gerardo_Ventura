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
public class Usuario {
    private float peso;
    private float altura;

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) throws NumeroNoNegativoException{
        ValidacionUsuario.validarNoNegativo(peso);
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura)throws NumeroNoNegativoException{
        ValidacionUsuario.validarNoNegativo(altura);
        this.altura = altura;
    }
    
}
