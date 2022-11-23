package com.example.pia.services;

import com.example.pia.models.TeamsModel;
import com.example.pia.repositories.TeamsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class TeamsService {
    @Autowired
    TeamsRepository teamsRepository;

    public ArrayList<TeamsModel> obtenerTeams(){
        return (ArrayList<TeamsModel>)teamsRepository.findAll();
    }
    public TeamsModel guardarTeams(TeamsModel teams){
        return teamsRepository.save(teams);
    }

    public Optional<TeamsModel> obtenerPorPosicion(int position) {
        return teamsRepository.findByPosition(position);
    }
    public boolean eliminarTeam(int position) {
        try {
            teamsRepository.deleteByPosition(position);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
