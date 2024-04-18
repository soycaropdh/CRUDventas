package com.unicartagena.Api_Gestor_de_tareas.aplications.service;


import com.unicartagena.Api_Gestor_de_tareas.aplications.entities.Tarea;

import java.util.List;

public interface ITareaService {

    List<Tarea> obtenerTodas();
    Tarea obtenerPorId(Long id);
    Tarea crearTarea( Tarea titulo);
    Tarea editarTarea(Long id ,  Tarea titulo);

    void  eliminarTarea(Long id);

    long contarTareas();


}
