/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.concomics.model.bo.TipoUsuario;
import javax.persistence.EntityManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ramon
 */
public class TipoUsuarioTest {
    
    public TipoUsuarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    EntityManager em;
    
    TipoUsuario user = new TipoUsuario();
    @Test
    public void criar() {
        try {
            
            em.getTransaction().begin();       
            em.persist(user);
            em.getTransaction().commit();
            em.close();
                
        } catch(Exception e){
           System.out.println("");
        }
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
