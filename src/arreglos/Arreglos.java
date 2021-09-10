/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

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
        int edad = 99;
        Heroe heroe =new Heroe();
        Enemigo enemigo=new Enemigo();
        
        //acceder
        heroe.setEdad(edad);
        
        System.out.println(heroe.getEdad());
    }
    
}
