package lst;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import model.Personne;

/**
 * Application Lifecycle Listener implementation class Listener1
 *
 */
@WebListener
public class Listener1 implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public Listener1() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
    	ServletContext app = arg0.getServletContext();
		
		ArrayList<Personne> personnes = new ArrayList<Personne>();
		personnes.add(new Personne("aa", "bb", 14));
		personnes.add(new Personne("ss", "dd", 15));
		personnes.add(new Personne("cc", "gg", 16));
		
		app.setAttribute("personnes", personnes);
		System.out.println(app.getAttribute("personnes"));
    }
	
}
