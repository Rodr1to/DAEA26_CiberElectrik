package pe.com.ciberelectrik.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "rol")
public class RolEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codrol")
    private Integer codrol;

    @Column(name = "nomrol", nullable = false, length = 40)
    private String nomrol;

    @Column(name = "estrol", nullable = false)
    private Boolean estrol;
}
