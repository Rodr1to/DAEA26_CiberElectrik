package pe.com.ciberelectrik.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller -> controlador -> de la aplicacion web
@Controller
public class InicioController {
    //@GetMapping -> sirve para rutas y algunas acciones
    //@PostMapping  -> sirve para las acciones generadas por un boton

    //creamos una ruta para el index
    @GetMapping
    public String MostrarInicio() {
        return "index";
    }

    @GetMapping("/menuprincipal")
    public String MostrarMenuPrincipal() {
        return "menuprincipal";
    }
}

