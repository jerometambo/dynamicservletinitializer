package org.jerometambo.dynamicservletinitializer.servlet;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRegistration.Dynamic;

import org.jerometambo.dynamicservletinitializer.util.HelloWorldProperties;

/**
 * Servlets initialization.
 */
public class DynamicServletInitializer implements ServletContextListener {

    private static final HelloWorldProperties properties = new HelloWorldProperties();

    public void contextInitialized(ServletContextEvent servletContextEvent) {
        final int size = properties.getUploadSizeLimit() * 1024;
        Dynamic registered = servletContextEvent.getServletContext().addServlet("HelloWorld", HelloWorld.class);
        registered.setMultipartConfig(new MultipartConfigElement(properties.getUploadTempDir(), size, size, size));
        registered.addMapping("/HelloWorld");
    }

    public void contextDestroyed(ServletContextEvent sce) {

    }

}
