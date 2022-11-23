package com.example.pia.repositories;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.pia.models.RunnerModel;

@Repository
public interface RunnerRepository extends CrudRepository<RunnerModel, Long> {
    public abstract ArrayList<RunnerModel> findByPosition(int position);

}
