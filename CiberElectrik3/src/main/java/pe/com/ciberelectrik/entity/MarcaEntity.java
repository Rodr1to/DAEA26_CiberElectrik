package pe.com.ciberelectrik.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.*;

import pe.com.ciberelectrik.entity.base.BaseEntity;

//Lombok------------------------------------------------------------
@NoArgsConstructor //metodo constructor sin parametros
@AllArgsConstructor //metodo constructor con parametros
@Data //metodos get,set, equals, hashcode y toString
@EqualsAndHashCode(callSuper = false)
//------------------------------------------------------------------
//Jakarta
@Entity(name = "MarcaEntity") //define la entidad
@Table(name = "marca") //define la tabla relacionada
//serializamos la clase
public class MarcaEntity extends BaseEntity implements Serializable {

    //identificador de la serializacion
    private static final long serialVersionUID = 1L;

    @Id //clave primaria
    @Column(name = "codmar") //define la columna relacionada
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincremento
    private Long codigo;
}
