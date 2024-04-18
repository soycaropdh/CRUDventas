package com.unicartagena.Api_Gestor_de_tareas.aplications.controller;

import com.unicartagena.Api_Gestor_de_tareas.aplications.entities.Tarea;
import com.unicartagena.Api_Gestor_de_tareas.aplications.service.TareasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller // el controller depende del servicio y el servicio llama al repository
@RequestMapping("/tareas")
public class TareaController {

    @Autowired // con @Autowired lo inyectamos
    private TareasService tareasService; // estamos inyectando el servivio

    // la clase model se utiliza para tranferir objetos del controller a la vista
@GetMapping
public String listarTareas(Model model) {

    List<Tarea> tareas = tareasService.obtenerTodas();
    model.addAttribute("tareasLista", tareas);
    return "listar";

}
@GetMapping("/nueva")
public String mostrarFormularioDeNuevaTarea(Model model){
    model.addAttribute("tarea",new Tarea());
    model.addAttribute("accion","/tareas/nueva");
    return "formulario";


    }
@PostMapping("/nueva")
public String guardarNuevaTarea(@ModelAttribute Tarea tarea ){
    tareasService.crearTarea(tarea);
    return "redirect:/tareas";


}
    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditarTarea(@PathVariable long id,@ModelAttribute Tarea tarea,Model model){
        model.addAttribute("tarea",tarea);
        model.addAttribute("accion","/tareas/editar/"+id);
        return "formulario";


    }

    @PostMapping("/editar/{id}")
    public String actualizarTarea(@PathVariable long id,@ModelAttribute Tarea tarea ){
    tareasService.editarTarea(id,tarea);
    return "redirect:/tareas";

    }

    @GetMapping("/eliminar/{id}")
    public String eliminarTarea(@PathVariable long id){
    tareasService.eliminarTarea(id);
    return "redirect:/tareas";

    }
}


