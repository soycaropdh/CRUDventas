package com.unicartagena.Api_Gestor_de_tareas.aplications.repository;

import com.unicartagena.Api_Gestor_de_tareas.aplications.entities.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//siempre para un repositoy en sprin boot se crea intefaces
//simempre estiende de JpaRepository y se agrega la entidad y tipo de id
@Repository // es para categorisar y que entre al conntenedor de spring(es unesteriotipo)

public interface TareaRepository  extends JpaRepository<Tarea,Long> {

    @Override
    Optional<Tarea> findById(Long id);
    Optional<Tarea> findBytitulo(String titulo );
    Optional<Tarea> findBydescripcion(String descripcion);
    Optional<Tarea> findByfechaDeInicio(String FechaDeInicio);
    Optional<Tarea> findByfechaLimite(String FechaLimite);
    Optional<Tarea> findByestado(String estado);



}
