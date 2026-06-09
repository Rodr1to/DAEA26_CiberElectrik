package pe.com.ciberelectrik.entity;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Lombok------------------------------------------------------------
@NoArgsConstructor //metodo constructor sin parametros
@AllArgsConstructor //metodo constructor con parametros
@Data //metodos get,set, equals, hashcode y toString
@Builder //genera la clase builder
//------------------------------------------------------------------
//Jakarta
@Entity(name = "MarcaEntity") //define la entidad
@Table(name = "marca") //define la tabla relacionada
//serializamos la clase
public class MarcaEntity implements Serializable {
    //identificador de la serializacion
    private static final long serialVersionUID = 1L;

    @Id //clave primaria
    @Column(name = "codmar") //define la columna relacionada
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincremento
    private Long codigo;

    @Column(name = "nommar", length = 40,nullable = false)
    private String nombre;

    @Column(name="estmar", nullable = false)
    private Boolean estado;
}
