
package clases;

import java.io.IOException;
import javax.swing.JOptionPane;
import ventana.Bienvenida;
import ventana.Registro_final;



public class seguridad {
    Registro_final login = new Registro_final();
    String res;

    
    public void validarUsuario(String usuarios[], String user, String pass,int intentos) throws IOException{
        boolean encontrado = false;
        for(int i = 0; i<usuarios.length;i++){
            if((usuarios[i].equalsIgnoreCase(user)&& usuarios[i+1].equals(pass))){
               res = "Bienvenido " + user;         
               encontrado = true;
                Bienvenida m1 = new Bienvenida();  
                m1.setVisible(true);
                new Registro_final().dispose();
                JOptionPane.showMessageDialog(null, res,"Inicio de sesión",JOptionPane.INFORMATION_MESSAGE);
                intentos = 0;
                login.setIntentos(intentos); 
                break;
            }
        }//FIN DEL FOR
        if(encontrado == false){
            res = "Nombre de usuario o contraseña erroneos " + intentos + " Intentos fallidos";
          JOptionPane.showMessageDialog(null, res,"Inicio de sesión",JOptionPane.ERROR_MESSAGE);
        }
        if(intentos > 2 ){
    JOptionPane.showMessageDialog(null, "3 intentos fallidos","Inicio de sesión", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
    }
    
}
}
