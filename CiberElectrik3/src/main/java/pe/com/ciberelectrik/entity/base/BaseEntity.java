package pe.com.ciberelectrik.entity.base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder //herencia
@MappedSuperclass //mapeo de clases
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BaseEntity {
    @Column(name = "nombre", length = 50,nullable = false)
    private String nombre;
    @Column(name="estado", nullable = false)
    private Boolean estado;
}

