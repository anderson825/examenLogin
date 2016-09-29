/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginDAO;

import java.util.ArrayList;
import modelo.login;

/**
 *
 * @author Mauro
 */
public class loginDAO {
    
        private ArrayList<login> login;

    public loginDAO() {
        login = new ArrayList<>();
    }

    public int create(login e){
       login aux = find(e.getUsuario());
       if(aux!=null){
           return 0;
       }
       login.add(e);
       return 1;
   }

    private login find(String usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        

    
}
