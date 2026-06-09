package pe.com.ciberelectrik.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "TipoDocumentoEntity")
@Table(name = "tipodocumento")
public class TipoDocumentoEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codtipd")
    private Long codtipd;

    @Column(name = "nomtipd", nullable = false, length = 30)
    private String nomtipd;

    @Column(name = "esttipd", nullable = false)
    private Boolean esttipd;
}
