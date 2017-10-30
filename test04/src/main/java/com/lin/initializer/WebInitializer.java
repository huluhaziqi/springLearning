package com.lin.initializer;

import com.lin.config.MyMvcConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebInitializer implements WebApplicationInitializer {

@Override
public void onStartup(ServletContext servletContext)
        throws ServletException {
    AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
    ctx.register(MyMvcConfig.class);
    ctx.setServletContext(servletContext); //2

    ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(ctx)); //3
    servlet.addMapping("/");
    servlet.setLoadOnStartup(1);
    servlet.setAsyncSupported(true);//1开启异步支持

}
}
