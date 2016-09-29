/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlogin.controlador;

import loginDAO.loginDAO;
import loginDAO.usuarioDAO;
import modelo.login;
import modelo.usuario;

/**
 *
 * @author Mauro
 */
public class controlador {
    
    private  loginDAO dao = new loginDAO();    
    private  usuarioDAO daos = new usuarioDAO();
    
    public void crear(login l){
        int resultado= dao.create(l);
        
        if(resultado ==1){
            System.out.println("registro el estudiante");
        }
    }
    public void crearUsuario(usuario u){
        int resultado= daos.create(u);
       
        if(resultado ==1){
            System.out.println("registro el estudiante");
        }
    }
    
}
