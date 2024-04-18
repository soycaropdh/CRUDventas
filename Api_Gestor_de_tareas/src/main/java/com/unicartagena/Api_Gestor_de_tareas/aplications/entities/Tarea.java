package com.unicartagena.Api_Gestor_de_tareas.aplications.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
@Data // esta se encarga de crear  lo get y set
@Entity
@AllArgsConstructor // crea un contructor en el que incluye todos los campos
@NoArgsConstructor // crea un contructor sin ningun campo
@Table(name = "tareas")
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    @Column(length = 50)
    @NotBlank
    private String titulo;
    @NonNull
    @Column(length = 200)
    @NotBlank
    private String descripcion;
    @NonNull
    @Column(name = "fechaDeInicio")
    @NotBlank
    private String fechaDeInicio;
    @NonNull
    @Column(name = "fechaLimite")
    @NotBlank
    private String fechaLimite;
    @NonNull
    @Column(length = 50)
    @NotBlank
    private String estado;

}
