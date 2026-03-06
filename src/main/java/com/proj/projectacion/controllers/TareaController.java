package com.proj.projectacion.controllers;


import com.proj.projectacion.models.TareaModel;
import com.proj.projectacion.services.TareaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TareaController {
    private final TareaService tareaService;

    public TareaController(TareaService tareaService) {
        this.tareaService = tareaService;
    }

    @PostMapping("/addTarea")
    public TareaModel aniadir(@RequestBody TareaModel tarea){
        return tareaService.crearTarea(tarea);
    }
    @GetMapping("/tareas")
    public List<TareaModel> aniadir(){
        return tareaService.obtenerTareas();
    }
    @DeleteMapping("/tareas/{id}")
    public void borrar(@PathVariable String id){
        tareaService.eliminarTareas(id);
    }


}
