package pe.com.ciberelectrik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TipoDocumentoController {

    @GetMapping("/tipodocumento/listar") public String listarTipoDoc() {
        return "tipodocumento/listartipodocumento";
    }

    @GetMapping("/tipodocumento/registro") public String registrarTipoDoc() {
        return "tipodocumento/registrartipodocumento";
    }

    @GetMapping("/tipodocumento/actualiza") public String actualizarTipoDoc() {
        return "tipodocumento/actualizartipodocumento";
    }

    @GetMapping("/tipodocumento/habilita") public String habilitarTipoDoc() {
        return "tipodocumento/habilitartipodocumento";
    }
}
