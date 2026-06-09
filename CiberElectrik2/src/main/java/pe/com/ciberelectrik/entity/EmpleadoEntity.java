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
@Entity(name = "EmpleadoEntity")
@Table(name = "empleado")
public class EmpleadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codemp")
    private Long codemp;

    @Column(name = "nomemp", nullable = false, length = 40)
    private String nomemp;

    @Column(name = "apepemp", nullable = false, length = 30)
    private String apepemp;

    @Column(name = "apememp", nullable = false, length = 30)
    private String apememp;

    @Column(name = "docemp", nullable = false, length = 15)
    private String docemp;

    @Column(name = "fecemp", nullable = false)
    private LocalDate fecemp;

    @Column(name = "diremp", nullable = false, length = 100)
    private String diremp;

    @Column(name = "telemp", nullable = false, length = 15)
    private String telemp;

    @Column(name = "celemp", nullable = false, length = 15)
    private String celemp;

    @Column(name = "coremp", nullable = false, length = 100)
    private String coremp;

    @Column(name = "usuemp", nullable = false, length = 40)
    private String usuemp;

    @Column(name = "claemp", nullable = false, length = 255)
    private String claemp;

    @Column(name = "estemp", nullable = false)
    private Boolean estemp;

    @ManyToOne
    @JoinColumn(name = "coddis", referencedColumnName = "coddis", nullable = false)
    private DistritoEntity distrito;

    @ManyToOne
    @JoinColumn(name = "codsex", referencedColumnName = "codsex", nullable = false)
    private SexoEntity sexo;

    @ManyToOne
    @JoinColumn(name = "codrol", referencedColumnName = "codrol", nullable = false)
    private RolEntity rol;

    @ManyToOne
    @JoinColumn(name = "codtipd", referencedColumnName = "codtipd", nullable = false)
    private TipoDocumentoEntity tipoDocumento;
}
