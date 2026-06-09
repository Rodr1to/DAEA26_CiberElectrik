package pe.com.ciberelectrik.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "TicketPedidoEntity")
@Table(name = "ticketpedido")
public class TicketPedidoEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nrotic")
    private Long numero;

    @Column(name = "fectic", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime fecha;

    @Column(name = "esttic", nullable = false)
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "codcli", nullable = false)
    private ClienteEntity cliente;

    @ManyToOne
    @JoinColumn(name = "codemp", nullable = false)
    private EmpleadoEntity empleado;

    @OneToMany(mappedBy = "ticketpedido", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleTicketPedidoEntity> detalles;

}


