package pe.com.ciberelectrik.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tipodocumento")
public class TipoDocumentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codtipd")
    private Integer codtipd;

    @Column(name = "nomtipd", nullable = false, length = 30)
    private String nomtipd;

    @Column(name = "esttipd", nullable = false)
    private Boolean esttipd;
}
