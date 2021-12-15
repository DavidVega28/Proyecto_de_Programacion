
package clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ventana.Añadir_carreras;
import ventana.Registro_final;


public class ApLogin {
    public static void main(String[] args){
        Registro_final abrir = null;
        try {
            abrir = new Registro_final();
        } catch (IOException ex) {
            Logger.getLogger(ApLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        abrir.setVisible(true);
       
}}