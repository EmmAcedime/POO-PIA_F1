package com.example.pia.controllers;

import com.example.pia.models.TeamsModel;
import com.example.pia.services.TeamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/teams")
public class TeamsController {
    @Autowired
    TeamsService teamsService;
    @GetMapping()
    public ArrayList<TeamsModel> obtenerTeams(){
        return teamsService.obtenerTeams();
    }
    @PostMapping()
    public TeamsModel guardarTeams(@RequestBody TeamsModel teams){
        return this.teamsService.guardarTeams(teams);
    }

    @GetMapping(path = "/{Position}")
    public ArrayList<TeamsModel> obtenerTeamsPorPosition(@PathVariable("position") int position){
        return this.teamsService.obtenerPorPosicion(position);
    }
    //@GetMapping("/query")
    //public ArrayList<TeamsModel> obtenerTeamsPorPosition(@RequestParam("posicion"))
    @DeleteMapping(path = "/{Position}")
    public String eliminarPorPosicion(@PathVariable("Position") int Position) {
        boolean ok = this.teamsService.eliminarTeam(Position);
        if (ok) {
            return "Se eliminó el corredor del puesto no. " + Position;
        } else {
            return "No pudo eliminar el corredor del puesto no." + Position;
        }
    }
}
