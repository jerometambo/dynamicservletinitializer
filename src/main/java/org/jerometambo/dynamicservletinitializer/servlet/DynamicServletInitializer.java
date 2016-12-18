package org.jerometambo.dynamicservletinitializer.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRegistration.Dynamic;

/**
 * Servlets initialization.
 */
public class DynamicServletInitializer implements ServletContextListener {

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Dynamic registered = servletContextEvent.getServletContext().addServlet("HelloWorld", HelloWorld.class);
        registered.addMapping("/HelloWorld");
    }

    public void contextDestroyed(ServletContextEvent sce) {

    }

}
