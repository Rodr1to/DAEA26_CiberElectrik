package pe.com.ciberelectrik.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.ciberelectrik.entity.TicketPedidoEntity;

import java.util.List;

public interface TicketPedidoRepository extends JpaRepository<TicketPedidoEntity, Long> {
    @Query("""
            select t.numero,
                   t.fecha,
                   concat(e.nomemp,' ',e.apepemp,' ', e.apememp),
                   concat(c.nomcli, ' ', c.apepcli, ' ', c.apemcli),
                   coalesce(sum(d.cantidad * d.precio)),
                   t.estado
            from TicketPedidoEntity t
            inner join t.empleado e
            inner join t.cliente c
            inner join t.detalles d
            group by t.numero, t.fecha, e.nomemp, e.apepemp, e.apememp, c.nomcli, c.apepcli, c.apemcli, t.estado
            order by t.numero asc
            """)
    List<Object[]> findAllCustom();

    @Query("""
            select t.numero,
                   t.fecha,
                   concat(e.nomemp,' ',e.apepemp,' ', e.apememp),
                   concat(c.nomcli, ' ', c.apepcli, ' ', c.apemcli),
                   c.dircli,
                   c.celcli,
                   t.estado
            from TicketPedidoEntity t
            inner join t.empleado e
            inner join t.cliente c
            where t.numero=?1
            """)
    List<Object[]> findCabeceraDetalle(Long id);

    @Query("""
           select p.nombre,
                  d.cantidad,
                  d.precio,
                  (d.cantidad * d.precio)
           from DetalleTicketPedidoEntity d
           inner join d.producto p
           where d.ticketpedido.numero=?1
           """)
    List<Object[]> findDetalleTicket(Long id);

    @Query("select coalesce(max(t.numero),0)+1 from TicketPedidoEntity t")
    Long setCode();
}