package pe.com.ciberelectrik.controller.generic;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import pe.com.ciberelectrik.service.generic.GenericoService;

public abstract class GenericoController<T> {
    //importamos el servicio generico
    protected abstract GenericoService<T> getServicio();

    //obtener la ruta
    protected abstract String getRuta();

    //obtener la vista de listar
    protected abstract String getVistaListar();

    //obtener la vista de registrar
    protected abstract String getVistaRegistrar();

    //obtener la vista de actualizar
    protected abstract String getVistaActualizar();

    //obtener la vista de habilitar
    protected abstract String getVistaHabilitar();

    //obtener el nombre de la lista
    protected abstract String getNombreLista();

    //obtener el nombre del objeto
    protected abstract String getNombreObjeto();

    //crear un objeto
    protected abstract T crearObjeto();

    //cargar los combos
    protected void cargarCombos(Model modelo) {
        // Solo se sobrescribe si el formulario tiene combos
    }
    @GetMapping("/listar")
    public String listar(Model modelo) {
        modelo.addAttribute(getNombreLista(), getServicio().findAllCustom());
        return getVistaListar();
    }

    @GetMapping("/listartodo")
    public String listartodo(Model modelo) {
        modelo.addAttribute(getNombreLista(), getServicio().findAllCustom());
        return getVistaListar();
    }
    @GetMapping("/registro")
    public String registro(Model modelo) {
        modelo.addAttribute(getNombreObjeto(), crearObjeto());
        cargarCombos(modelo);
        return getVistaRegistrar();
    }
    @GetMapping("/actualiza/{id}")
    public String actualizarVista(@PathVariable Long id, Model modelo) {
        modelo.addAttribute(getNombreObjeto(), getServicio().findById(id));
        cargarCombos(modelo);
        return getVistaActualizar();
    }
    @GetMapping("/habilita")
    public String habilitarVista(Model modelo) {
        modelo.addAttribute(getNombreLista(), getServicio().findAll());
        return getVistaHabilitar();
    }
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        getServicio().delete(id);
        return "redirect:/" + getRuta() + "/listar";
    }
    @GetMapping("/habilitar/{id}")
    public String habilitar(@PathVariable Long id) {
        getServicio().enable(id);
        return "redirect:/" + getRuta() + "/habilita";
    }
    @GetMapping("/deshabilitar/{id}")
    public String deshabilitar(@PathVariable Long id) {
        getServicio().delete(id);
        return "redirect:/" + getRuta() + "/habilita";
    }
    @PostMapping("/registrar")
    public String registrar(@ModelAttribute T obj) {
        getServicio().add(obj);
        return "redirect:/" + getRuta() + "/listar";
    }
    @PostMapping("/actualizar/{id}")
    public String actualizar(@ModelAttribute T obj, @PathVariable Long id) {
        getServicio().update(obj, id);
        return "redirect:/" + getRuta() + "/listar";
    }
}
