package pe.com.ciberelectrik.service;

import pe.com.ciberelectrik.entity.TicketPedidoEntity;

import java.util.List;

public interface TicketPedidoService {
    List<TicketPedidoEntity> findAll();
    List<Object[]> findAllCustom();
    TicketPedidoEntity findById(Long id);
    TicketPedidoEntity add(Long codcli, Long codemp, Boolean estado, Long[] productos, Integer[] cantidades, Double[] precios);
    TicketPedidoEntity delete(Long id);
    TicketPedidoEntity enable(Long id);
    List<Object[]> findCabeceraDetalle(Long id);
    List<Object[]> findDetalleTicket(Long id);
    Long setCode();
}
