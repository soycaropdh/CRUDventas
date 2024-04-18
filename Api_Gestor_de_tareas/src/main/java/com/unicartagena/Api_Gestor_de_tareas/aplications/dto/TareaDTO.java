package com.unicartagena.Api_Gestor_de_tareas.aplications.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TareaDTO {
 private Long id;
 private String titulo;
 private  String descripcion;
 private  String FechaDeInicio;
 private  String FechaLimite;
 private String estado;




}
