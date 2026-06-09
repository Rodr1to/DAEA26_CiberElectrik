package pe.com.ciberelectrik.service.impl;

import org.springframework.stereotype.Service;
import pe.com.ciberelectrik.entity.*;
import pe.com.ciberelectrik.repository.TicketPedidoRepository;
import pe.com.ciberelectrik.service.TicketPedidoService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class TicketPedidoServiceImpl implements TicketPedidoService {

    private final TicketPedidoRepository repositorio;

    private TicketPedidoServiceImpl(TicketPedidoRepository repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<TicketPedidoEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<Object[]> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public TicketPedidoEntity findById(Long id) {
        return null;
    }

    @Override
    public TicketPedidoEntity add(Long codcli, Long codemp, Boolean estado, Long[] productos, Integer[] cantidades, Double[] precios) {
        TicketPedidoEntity ticket = new TicketPedidoEntity();
        ticket.setFecha(LocalDateTime.now());
        ticket.setEstado(estado);

        ClienteEntity cliente = new ClienteEntity();
        cliente.setCodcli(codcli);
        ticket.setCliente(cliente);

        EmpleadoEntity empleado = new EmpleadoEntity();
        empleado.setCodemp(codemp);
        ticket.setEmpleado(empleado);

        List<DetalleTicketPedidoEntity> detalles = new ArrayList<>();

        for(int i=0; i<productos.length; i++){
            if(productos[i]!=null && cantidades[i] != null && precios[i] != null) {
                DetalleTicketPedidoEntity detalle = new DetalleTicketPedidoEntity();

                ProductoEntity producto = new ProductoEntity();
                producto.setCodigo(productos[i]);

                detalle.setProducto(producto);
                detalle.setCantidad(cantidades[i]);
                detalle.setPrecio(precios[i]);
                detalle.setTicketpedido(ticket);
                detalles.add(detalle);
            }
        }

        ticket.setDetalles(detalles);
        return repositorio.save(ticket);
    }

    @Override
    public TicketPedidoEntity delete(Long id) {
        TicketPedidoEntity objticket = repositorio.findById(id).get();
        objticket.setEstado(false);
        return repositorio.save(objticket);
    }

    @Override
    public TicketPedidoEntity enable(Long id) {
        TicketPedidoEntity objticket = repositorio.findById(id).get();
        objticket.setEstado(true);
        return repositorio.save(objticket);
    }

    @Override
    public List<Object[]> findCabeceraDetalle(Long id) {
        return repositorio.findCabeceraDetalle(id);
    }

    @Override
    public List<Object[]> findDetalleTicket(Long id) {
        return repositorio.findDetalleTicket(id);
    }

    @Override
    public Long setCode() {
        return repositorio.setCode();
    }
}
