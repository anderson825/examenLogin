/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginDAO;

import java.util.ArrayList;
import modelo.usuario;

/**
 *
 * @author Mauro
 */
public class usuarioDAO {
    private ArrayList<usuario> listadoUsuario;
    
    public usuarioDAO(){
        listadoUsuario = new ArrayList<>();
    }

    
   public int create(usuario e){
       usuario aux = find(e.getCedula());
       if(aux!=null){
           return 0;
       }
       listadoUsuario.add(e);
       return 1;
   }

    private usuario find(String cedula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
