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
@Entity(name = "SexoEntity")
@Table(name = "sexo")
public class SexoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codsex")
    private Long codsex;

    @Column(name = "nomsex", nullable = false, length = 20)
    private String nomsex;

    @Column(name = "estsex", nullable = false)
    private Boolean estsex;
}
