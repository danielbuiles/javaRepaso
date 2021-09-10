/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;
import packete2.Heroe;

/**
 *
 * @author 503
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        int[] numeros=new int[5];
        
        for(int i=0;i<numeros.length;i++){
            System.out.println("digita un numero");
            numeros[i]=entrada.nextInt();
        }
        
        for(int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
    }
}
