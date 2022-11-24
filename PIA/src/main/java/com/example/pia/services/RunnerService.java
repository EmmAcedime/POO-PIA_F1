package com.example.pia.services;

import java.util.ArrayList;

import com.example.pia.models.RunnerModel;
import com.example.pia.repositories.RunnerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RunnerService {
    @Autowired
    RunnerRepository runnerRepository;

    public ArrayList<RunnerModel> obtenerCorredores() {
        return (ArrayList<RunnerModel>) runnerRepository.findAll();
    }

    public RunnerModel guardarCorredor(RunnerModel corredor) {
        return runnerRepository.save(corredor);
    }

    public ArrayList<RunnerModel> obtenerPorPosicion(int position) {
        return runnerRepository.findByPosition(position);
    }

    public boolean eliminarCorredor(int position) {
        try {
            runnerRepository.deleteByPosition(position);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
