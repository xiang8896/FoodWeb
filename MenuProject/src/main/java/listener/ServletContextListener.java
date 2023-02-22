 package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;

import model.UserFunction;
import model.AccountImpl;
import model.JDBC;
import model.MessageBoardImpl;


@WebListener
public class ServletContextListener implements javax.servlet.ServletContextListener {
	private JDBC jdbc;
   
    public ServletContextListener() {}

	
    public void contextDestroyed(ServletContextEvent sce)  { 
        
    }

	
    public void contextInitialized(ServletContextEvent sce)  { 
         ServletContext context = sce.getServletContext();
         var userDAO = new AccountImpl(jdbc);
         var speechDAO = new MessageBoardImpl(jdbc);
         //context.setAttribute("userDAO", userDAO);
         //context.setAttribute("speechDAO", speechDAO);
         context.setAttribute("userFunction", new UserFunction(userDAO,speechDAO));
    }
	
}
