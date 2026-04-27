package pe.com.ciberelectrik.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "categoria")
public class CategoriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codcat")
    private Integer codcat;

    @Column(name = "nomcat", nullable = false, length = 40)
    private String nomcat;

    @Column(name = "estcat", nullable = false)
    private Boolean estcat;
}
