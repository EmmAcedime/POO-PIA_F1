package com.example.pia.controllers;

import java.util.ArrayList;

import com.example.pia.models.RunnerModel;
import com.example.pia.services.RunnerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/corredor")
public class RunnerController {
    @Autowired
    RunnerService runnerService;

    @GetMapping()
    public ArrayList<RunnerModel> obtenerCorredores() {
        return runnerService.obtenerCorredores();
    }

    @PostMapping()
    public RunnerModel guardarRunner(@RequestBody RunnerModel corredor) {
        return this.runnerService.guardarCorredor(corredor);
    }

    @GetMapping(path = "/{Position}")
    public ArrayList<RunnerModel> obtenerCorredorPorPosicion(@PathVariable("Position") int position) {
        return this.runnerService.obtenerPorPosicion(position);
    }

    @DeleteMapping(path = "/{Position}")
    public String eliminarPorPosicion(@PathVariable("Position") int Position) {
        boolean ok = this.runnerService.eliminarCorredor(Position);
        if (ok) {
            return "Se eliminó el corredor del puesto no. " + Position;
        } else {
            return "No pudo eliminar el corredor del puesto no." + Position;
        }
    }

}