package pe.com.ciberelectrik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.com.ciberelectrik.controller.generic.GenericoController;
import pe.com.ciberelectrik.entity.ProductoEntity;
import pe.com.ciberelectrik.service.CategoriaService;
import pe.com.ciberelectrik.service.MarcaService;
import pe.com.ciberelectrik.service.ProductoService;
import pe.com.ciberelectrik.service.generic.GenericoService;

@Controller
@RequestMapping("/producto")
public class ProductoController extends GenericoController<ProductoEntity> {

    private final ProductoService servicio;
    private final MarcaService servicioMar;
    private final CategoriaService servicioCat;

    public ProductoController(
            ProductoService servicio,
            MarcaService servicioMar,
            CategoriaService servicioCat) {
        this.servicio = servicio;
        this.servicioMar = servicioMar;
        this.servicioCat = servicioCat;
    }

    @Override
    protected GenericoService<ProductoEntity> getServicio() {
        return servicio;
    }

    @Override
    protected String getRuta() {
        return "producto";
    }

    @Override
    protected String getVistaListar() {
        return "producto/listarproducto";
    }

    @Override
    protected String getVistaRegistrar() {
        return "producto/registrarproducto";
    }

    @Override
    protected String getVistaActualizar() {
        return "producto/actualizarproducto";
    }

    @Override
    protected String getVistaHabilitar() {
        return "producto/habilitarproducto";
    }

    @Override
    protected String getNombreLista() {
        return "listarproducto";
    }

    @Override
    protected String getNombreObjeto() {
        return "producto";
    }

    @Override
    protected ProductoEntity crearObjeto() {
        return new ProductoEntity();
    }

    @Override
    protected void cargarCombos(Model modelo) {
        modelo.addAttribute("listarmarca", servicioMar.findAllCustom());
        modelo.addAttribute("listarcategoria", servicioCat.findAllCustom());
    }
}
