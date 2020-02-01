/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.security.SecureRandom;

/**
 *
 * @author Katsuo
 */
public class NumeroAleatorio {
    private static final int DEF_NUM_ALEAT = -1;
    protected int numeroAleatorio = DEF_NUM_ALEAT;
    
    
    //private static final int DEF_NUM_INGR = 0; // nunca va a ser un numero menor a 1
   //private int numeroIngresado = DEF_NUM_INGR;
    
    private static final int MIN_RANGE_DEF = 1;
    private static final int MAX_RANGE_DEF = 10;
    
    public int minRange = MIN_RANGE_DEF;
    public int maxRange = MAX_RANGE_DEF;
            
    public static final boolean ACERTO = true;
    public static final boolean NO_ACERTO  = false;
    
    public boolean verificacion = NO_ACERTO;
    
            
    public void setNumeroAleatorio(int numeroAleatorio){
        this.numeroAleatorio = numeroAleatorio;
    }
    
    public int getNumeroAleatorio(){
        return numeroAleatorio;
    }
    
    public void setMinRange(int minRange){
        this.minRange = minRange;
    }
    
    public int getMinRange(){
        return minRange;
    }
    
    public void setMaxRange(int maxRange){
        this.maxRange = maxRange;
    }
    
    public int getMaxRange(){
        return maxRange;
    }
    
    /*TO-DO: IMPLEMENTAR OPCION EN EL EJECUTABLE PARA ALTERAR EL RANGO DE VALORES A TOMAR EN ESTE METODO(procedimiento)*/
    public void generarNumeroAleatorio(){
        SecureRandom sr = new SecureRandom();
        sr.nextBytes(new byte[1]);
        numeroAleatorio = sr.nextInt(maxRange)+minRange;
    }
    
    public boolean verificarNumeros(int numeroIngresado){
        generarNumeroAleatorio();
        if(numeroIngresado == numeroAleatorio){
            System.out.println("Acerto");
            verificacion = ACERTO;
        }else{
            System.out.println("No acerto");
            verificacion = NO_ACERTO;
        }        
        return verificacion;
    }
    
}
