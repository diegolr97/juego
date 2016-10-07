/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Juego;
import java.io.IOException;

/**
* 
 * @author Diego
 * @version 15/06/2016, diego lucas romero
 */


public class Main {
    
    public static void main(String[] args) throws IOException {
        //ejecuta el controlador y este la vista
        new controlador( new Juego() ).iniciar() ;
       
        
    }

}
