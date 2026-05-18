package pe.com.ciberelectrik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductoController {

    @GetMapping("/producto/listar") public String listarProducto() {
        return "producto/listarproducto";
    }

    @GetMapping("/producto/registro") public String registrarProducto() {
        return "producto/registrarproducto";
    }

    @GetMapping("/producto/actualiza") public String actualizarProducto() {
        return "producto/actualizarproducto";
    }

    @GetMapping("/producto/habilita") public String habilitarProducto() {
        return "producto/habilitarproducto";
    }
}
