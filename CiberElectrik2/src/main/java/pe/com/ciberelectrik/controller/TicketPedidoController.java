package pe.com.ciberelectrik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pe.com.ciberelectrik.service.*;

import java.util.List;

@Controller
public class TicketPedidoController {

    private final TicketPedidoService servicio;
    private final ClienteService serviciocli;
    private final EmpleadoService servicioemp;
    private final ProductoService serviciopro;

    public TicketPedidoController(TicketPedidoService servicio, ClienteService serviciocli,
                                  EmpleadoService servicioemp, ProductoService serviciopro) {
        this.servicio=servicio;
        this.serviciocli=serviciocli;
        this.servicioemp=servicioemp;
        this.serviciopro=serviciopro;
    }

    @GetMapping("/ticketpedido/listar")
    public String MostrarListarTicketPedido(Model modelo) {
        modelo.addAttribute("listarticket",servicio.findAllCustom());
        return "ticketpedido/listarticketpedido";
    }

    @GetMapping("/ticketpedido/detalle/{id}")
    public String MostrarDetalleTicketPedido(@PathVariable Long id, Model modelo) {
        System.out.println("ENTRO AL CONTROLADOR");
        List<Object[]> cabecera = servicio.findCabeceraDetalle(id);
        System.out.println("CABECERA OK");
        Object[] ticket = cabecera.isEmpty() ? null : cabecera.get(0);

        List<Object[]> detalle = servicio.findDetalleTicket(id);
        System.out.println("DETALLE OK");
        double subtotal = 0;
            if (detalle != null ) {
                for (Object[] fila : detalle) {
                    if(fila[3] != null) {
                        subtotal += ((Number)fila[3]).doubleValue();
                    }
                }
            }

            double igv = subtotal * 0.18;
            double total = subtotal + igv;

        modelo.addAttribute("ticket",ticket);
        modelo.addAttribute("detalle",detalle);
        modelo.addAttribute("subtotal",subtotal);
        modelo.addAttribute("igv",igv);
        modelo.addAttribute("total",total);
        System.out.println("ANTES DEL RETURN");
        return "ticketpedido/detalleticketpedido";
    }

    @GetMapping("/ticketpedido/registro")
    public String MostrarRegistrarTicketPedido(Model modelo) {
        modelo.addAttribute("listarcliente",serviciocli.findAllCustom());
        modelo.addAttribute("listarempleado",servicioemp.findAllCustom());
        modelo.addAttribute("listarproducto",serviciopro.findAllCustom());
        modelo.addAttribute("siguientenumero",servicio.setCode());
        return "ticketpedido/registrarticketpedido";
    }

    @GetMapping("/ticketpedido/anular/{id}")
    public String AnularTicketPedido(@PathVariable Long id) {
        servicio.delete(id);
        return "redirect:/ticketpedido/listar";
    }

    @GetMapping("/ticketpedido/habilitar/{id}")
    public String HabilitarTicketPedido(@PathVariable Long id) {
        servicio.enable(id);
        return "redirect:/ticketpedido/listar";
    }

    @PostMapping("/ticketpedido/registrar")
    public String RegistrarTicketPedido(@RequestParam("codcli") Long codcli,
                                        @RequestParam("codemp") Long codemp,
                                        @RequestParam(value = "estado", defaultValue = "false") Boolean estado,
                                        @RequestParam("productos") Long[] productos,
                                        @RequestParam("cantidades") Integer[] cantidades,
                                        @RequestParam("precios") Double[] precios
                                        ){
        servicio.add(codcli, codemp, estado, productos, cantidades, precios);
        return "redirect:/ticketpedido/listar";
    }
}
