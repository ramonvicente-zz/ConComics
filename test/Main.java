
import com.concomics.model.bo.TipoUsuario;
import com.concomics.model.bo.Usuario;
import com.concomics.model.dao.TipoUsuarioDAO;
import com.concomics.model.dao.UsuarioDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramon
 */
public class Main {
    
    public static void main(String[] args){
        
        Usuario usr = new Usuario();
        
        usr.setNome("Joana d'Arc");
        usr.setEmail("joanahtinha@gmail.com");
        usr.setSenha("joananana");
        UsuarioDAO novoDao = new UsuarioDAO();
        novoDao.criar(usr);
        
    }
    
}
