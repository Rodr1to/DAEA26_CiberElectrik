package pe.com.ciberelectrik.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "marca")
public class MarcaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codmar")
    private Integer codmar;

    @Column(name = "nommar", nullable = false, length = 40)
    private String nommar;

    @Column(name = "estmar", nullable = false)
    private Boolean estmar;
}
