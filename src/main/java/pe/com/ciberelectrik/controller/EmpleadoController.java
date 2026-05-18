package pe.com.ciberelectrik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpleadoController {

    @GetMapping("/empleado/listar") public String listarEmpleado() {
        return "empleado/listarempleado";
    }

    @GetMapping("/empleado/registro") public String registrarEmpleado() {
        return "empleado/registrarempleado";
    }

    @GetMapping("/empleado/actualiza") public String actualizarEmpleado() {
        return "empleado/actualizarempleado";
    }

    @GetMapping("/empleado/habilita") public String habilitarEmpleado() {
        return "empleado/habilitarempleado";
    }
}
