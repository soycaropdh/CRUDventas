package com.unicartagena.Api_Gestor_de_tareas;

import com.unicartagena.Api_Gestor_de_tareas.aplications.entities.Tarea;
import com.unicartagena.Api_Gestor_de_tareas.aplications.service.ITareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ApiGestorDeTareasApplication  {

	@Autowired
private ITareaService iTareaService;

	public static void main(String[] args) {SpringApplication.run(ApiGestorDeTareasApplication.class, args);}
/*
	@Override
	public void run(String... args) throws Exception {

		iTareaService.crearTarea(new Tarea( 5L, "correr", "salir a correr", "13/11/13", "13/11/23","pendiente"));
		iTareaService.crearTarea(new Tarea( 6L, "comer", "salir a comer", "14/11/13", "14/11/23","pendiente"));
		iTareaService.crearTarea(new Tarea( 7L, "pasear", "salir a pasear", "15/11/13", "15/11/23","pendiente"));
		iTareaService.crearTarea(new Tarea( 8L, "estudiar", "estudiar con kate", "16/11/13", "16/11/23","pendiente"));

		//mostramos el numero de tareas
		System.out.println("Numero de tareas guardadas: " + iTareaService.contarTareas());

		//mostramos la lista de tareas
		List<Tarea> tareas = iTareaService.obtenerTodas();
		tareas.forEach((t-> System.out.println("Nombre de la tarea: "+ t.getTitulo())));
	}*/
}
