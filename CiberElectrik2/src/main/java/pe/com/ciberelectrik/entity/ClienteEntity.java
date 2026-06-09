package pe.com.ciberelectrik.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "ClienteEntity")
@Table(name = "cliente")
public class ClienteEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codcli")
    private Long codcli;

    @Column(name = "nomcli", nullable = false, length = 40)
    private String nomcli;

    @Column(name = "apepcli", nullable = false, length = 40)
    private String apepcli;

    @Column(name = "apemcli", nullable = false, length = 40)
    private String apemcli;

    @Column(name = "doccli", nullable = false, length = 15)
    private String doccli;

    @Column(name = "feccli", nullable = false)
    private LocalDate feccli;

    @Column(name = "dircli", nullable = false, length = 100)
    private String dircli;

    @Column(name = "telcli", length = 15)
    private String telcli;

    @Column(name = "celcli", nullable = false, length = 15)
    private String celcli;

    @Column(name = "corcli", length = 100)
    private String corcli;

    @Column(name = "estcli", nullable = false)
    private Boolean estcli;

    @ManyToOne
    @JoinColumn(name = "coddis", referencedColumnName = "coddis", nullable = false)
    private DistritoEntity distrito;

    @ManyToOne
    @JoinColumn(name = "codsex", referencedColumnName = "codsex", nullable = false)
    private SexoEntity sexo;

    @ManyToOne
    @JoinColumn(name = "codtipd", referencedColumnName = "codtipd", nullable = false)
    private TipoDocumentoEntity tipoDocumento;
}
