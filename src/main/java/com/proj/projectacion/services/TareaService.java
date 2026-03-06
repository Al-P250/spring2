package com.proj.projectacion.services;


import com.proj.projectacion.models.TareaModel;
import com.proj.projectacion.repositories.TareaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService {

    private final TareaRepository tareaRepository;

    public TareaService(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    public TareaModel crearTarea(TareaModel tarea) {

        new Thread(() -> {
            try {
                Thread.sleep(5000);
                tarea.setCompletada(true);
                tareaRepository.save(tarea);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        return tareaRepository.save(tarea);
    }

    public List<TareaModel> obtenerTareas(){
        return tareaRepository.findAll();
    }

    public void eliminarTareas(String id){
        tareaRepository.deleteById(id);
    }
}