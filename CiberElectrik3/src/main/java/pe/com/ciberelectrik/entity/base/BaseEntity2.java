package pe.com.ciberelectrik.entity.base;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder //herencia
@MappedSuperclass //mapeo de clases
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BaseEntity2 {
    @Column(name = "nombre", length = 40, nullable = false)
    private String nombre;

    @Column(name = "apellidopaterno", length = 40, nullable = false)
    private String apellidopaterno;

    @Column(name = "apellidomaterno", length = 40, nullable = false)
    private String apellidomaterno;

    @Column(name = "numerodocumento", length = 15, nullable = false)
    private String documento;

    @Column(name = "fechanacimeinto", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechanacimiento;

    @Column(name = "direccion", length = 200, nullable = false)
    private String direccion;

    @Column(name = "telefono", length = 15)
    private String telefono;

    @Column(name = "celular", length = 15, nullable = false)
    private String celular;

    @Column(name = "correo", length = 100)
    private String correo;

    @Column(name = "estado", nullable = false)
    private Boolean estado;
}

