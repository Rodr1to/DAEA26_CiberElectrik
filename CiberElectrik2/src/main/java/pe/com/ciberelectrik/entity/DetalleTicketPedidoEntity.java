package pe.com.ciberelectrik.entity;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "DetalleTicketPedidoEntity")
@Table(name = "detalleticketpedido")
public class DetalleTicketPedidoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nrodettic")
    private Long numeroDetalle;

    @Column(name = "pretic", nullable = false)
    private double precio;

    @Column(name = "cantic",nullable = false)
    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "nrotic", nullable = false)
    private TicketPedidoEntity ticketpedido;

    @ManyToOne
    @JoinColumn(name = "codpro", nullable = false)
    private ProductoEntity producto;

}
