package pe.com.ciberelectrik.entity;

import jakarta.persistence.*;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import pe.com.ciberelectrik.entity.base.BaseEntity2;


@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity(name = "ClienteEntity")
@Table(name = "cliente")
public class ClienteEntity extends BaseEntity2 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codcli")
    private Long codigo;

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
