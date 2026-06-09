package pe.com.ciberelectrik.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//@Configuration -> vuelve una clase de configuracion
@Configuration
//implementamos desde WebMvcConfigurer
public class WebConfig implements WebMvcConfigurer {

    //definimos la ubicacion donde se vana encontrar los recursos estaticos
    //@Override -> sobreescribimos el metodo
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
    }
}


