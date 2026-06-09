package pe.com.ciberelectrik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.com.ciberelectrik.controller.generic.GenericoController;
import pe.com.ciberelectrik.entity.CategoriaEntity;
import pe.com.ciberelectrik.service.CategoriaService;
import pe.com.ciberelectrik.service.generic.GenericoService;

@Controller
@RequestMapping("/categoria")
public class CategoriaController extends GenericoController<CategoriaEntity> {
    private final CategoriaService servicio;

    public CategoriaController(CategoriaService servicio) {
        this.servicio = servicio;
    }

    @Override
    protected GenericoService<CategoriaEntity> getServicio() {
        return servicio;
    }

    @Override
    protected String getRuta() {
        return "categoria";
    }

    @Override
    protected String getVistaListar() {
        return "categoria/listarcategoria";
    }

    @Override
    protected String getVistaRegistrar() {
        return "categoria/registrarcategoria";
    }

    @Override
    protected String getVistaActualizar() {
        return "categoria/actualizarcategoria";
    }

    @Override
    protected String getVistaHabilitar() {
        return "categoria/habilitarcategoria";
    }

    @Override
    protected String getNombreLista() {
        return "listarcategoria";
    }

    @Override
    protected String getNombreObjeto() {
        return "categoria";
    }

    @Override
    protected CategoriaEntity crearObjeto() {
        return new CategoriaEntity();
    }
}