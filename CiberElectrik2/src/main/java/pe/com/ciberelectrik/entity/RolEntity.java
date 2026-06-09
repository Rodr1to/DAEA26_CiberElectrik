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
@Entity(name = "RolEntity")
@Table(name = "rol")
public class RolEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codrol")
    private Long codrol;

    @Column(name = "nomrol", nullable = false, length = 40)
    private String nomrol;

    @Column(name = "estrol", nullable = false)
    private Boolean estrol;
}
