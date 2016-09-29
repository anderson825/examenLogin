/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlogin.controlador;

import loginDAO.loginDAO;
import modelo.login;

/**
 *
 * @author Mauro
 */
public class controlador {
    
    private  loginDAO dao = new loginDAO();    
    
    
    public void crear(login l){
        int resultado= dao.create(l);
        
        if(resultado ==1){
            System.out.println("registro el estudiante");
        }
  
        
    }
    
}
