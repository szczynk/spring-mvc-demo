package org.szczynk.spring_mvc_demo;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// kita buat Initializer yang diganti dengan FrontController
public class FrontController extends AbstractAnnotationConfigDispatcherServletInitializer {
    // - mendaftarkan Configuration class `SpringMvcDemoConfig`
    //   untuk root application context
    // - root application context mirip servlet context yaitu men-shared ke semua
    //   servlet dan filter,
    // - bedanya kalo di servlet yang di shared adalah attribute-nya,
    //   kalo di root application context yang di shared adalah bean-nya
    @Override
    protected Class<?>[] getRootConfigClasses() {
        // TODO Auto-generated method stub
        return new Class[]{SpringMvcDemoConfig.class};
    }

    // - mendaftarkan Configuration class `SpringMvcDemoConfig`
    //   untuk DispatcherServlet class
    // - class ini khusus DispatcherServlet context
    // - sekarang tidak lagi
    @Override
    protected Class<?>[] getServletConfigClasses() {
        // TODO Auto-generated method stub
        return null;
    }
    // @Override
    // protected Class<?>[] getServletConfigClasses() {
    //     // TODO Auto-generated method stub
    //     return new Class[]{SpringMvcDemoConfig.class};
    // }

    // me-mapping DispatcherServlet ke route "/"
    @Override
    protected String[] getServletMappings() {
        // TODO Auto-generated method stub
        return new String[]{"/"};
    }
}
