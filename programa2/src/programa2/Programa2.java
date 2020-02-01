/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa2;

import java.security.SecureRandom;

/**
 *
 * @author Katsuo
 */
public class Programa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SecureRandom sr = new SecureRandom();
        sr.nextBytes(new byte[1]);
        int numeroAleatorio = 0;
        
        for (int i = 0; i < 30; i++) {
            numeroAleatorio = sr.nextInt(5)+1;
            System.out.println(numeroAleatorio);
        }
    }

}
