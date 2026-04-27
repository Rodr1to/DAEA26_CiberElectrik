package pe.com.ciberelectrik.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "producto")
public class ProductoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codpro")
    private Integer codpro;

    @Column(name = "nompro", nullable = false, length = 60)
    private String nompro;

    @Column(name = "despro", nullable = false, length = 300)
    private String despro;

    @Column(name = "fecing", nullable = false)
    private LocalDate fecing;

    @Column(name = "prepro", nullable = false)
    private Double prepro;

    @Column(name = "canpro", nullable = false)
    private Integer canpro;

    @Column(name = "estpro", nullable = false)
    private Boolean estpro;

    @ManyToOne
    @JoinColumn(name = "codmar", referencedColumnName = "codmar", nullable = false)
    private MarcaEntity marca;

    @ManyToOne
    @JoinColumn(name = "codcat", referencedColumnName = "codcat", nullable = false)
    private CategoriaEntity categoria;
}