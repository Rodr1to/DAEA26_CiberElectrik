package pe.com.ciberelectrik.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sexo")
public class SexoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codsex")
    private Integer codsex;

    @Column(name = "nomsex", nullable = false, length = 20)
    private String nomsex;

    @Column(name = "estsex", nullable = false)
    private Boolean estsex;
}
