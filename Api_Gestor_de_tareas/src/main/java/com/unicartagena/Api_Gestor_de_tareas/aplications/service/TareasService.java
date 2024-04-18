package com.unicartagena.Api_Gestor_de_tareas.aplications.service;

import com.unicartagena.Api_Gestor_de_tareas.aplications.entities.Tarea;
import com.unicartagena.Api_Gestor_de_tareas.aplications.repository.TareaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class TareasService implements ITareaService {

@Autowired  // para traerlo del contenedor de spring
    private TareaRepository tareaRepository; //llamamos a la clase PersonaRepository para usar sus metodos

    @Override // esto significa que esta sobre escribiendo el metodo
    public List<Tarea> obtenerTodas() {
        return tareaRepository.findAll();


    }

    @Override
    public Tarea obtenerPorId(Long id) {
        return tareaRepository.findById(id).orElse(null);
    }

    @Override
    public Tarea crearTarea(Tarea titulo) {
        return tareaRepository.save(titulo);
    }

    @Override
    public Tarea editarTarea(Long id, Tarea titulo) {
        Tarea titulonotas = tareaRepository.findById(id).orElse(null);

        if (titulonotas != null){
            titulonotas.setTitulo(titulo.getTitulo());
            titulonotas.setDescripcion(titulo.getDescripcion());
            titulonotas.setFechaDeInicio(titulo.getFechaDeInicio());
            titulonotas.setFechaLimite(titulo.getFechaLimite());
            titulonotas.setEstado(titulo.getEstado());
            return tareaRepository.save(titulonotas);
        }
        return null;
    }

    @Override
    public void eliminarTarea(Long id) {

        tareaRepository.deleteById(id);

    }

    @Override
    public long contarTareas() {
        return tareaRepository.count();
    }
}
