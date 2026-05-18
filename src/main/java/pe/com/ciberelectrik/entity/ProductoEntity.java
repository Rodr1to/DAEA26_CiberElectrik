package pe.com.ciberelectrik.entity;

import java.io.Serializable;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity(name = "ProductoEntity")
@Table(name = "producto")
public class ProductoEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codpro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(name = "nompro", length = 60,nullable = false)
    private String nombre;

    @Column(name = "despro", length = 300,nullable = false)
    private String descripcion;

    @Column(name = "fecing",nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd") //formato de fecha
    private LocalDate fechaingreso;

    @Column(name = "prepro", nullable = false)
    private double precio;

    @Column(name = "canpro",nullable = false)
    private int cantidad;

    @Column(name="estpro", nullable = false)
    private Boolean estado;

    //claves foraneas
    //relacion de muchos a uno
    @ManyToOne
    @JoinColumn(name = "codmar",nullable = false)
    private MarcaEntity marca;

    @ManyToOne
    @JoinColumn(name = "codcat",nullable = false)
    private CategoriaEntity categoria;
}

