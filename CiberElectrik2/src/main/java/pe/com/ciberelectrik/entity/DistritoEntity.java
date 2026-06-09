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
@Entity(name = "DistritoEntity")
@Table(name = "distrito")
public class DistritoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coddis")
    private Long coddis;

    @Column(name = "nomdis", nullable = false, length = 30)
    private String nomdis;

    @Column(name = "estdis", nullable = false)
    private Boolean estdis;
}
