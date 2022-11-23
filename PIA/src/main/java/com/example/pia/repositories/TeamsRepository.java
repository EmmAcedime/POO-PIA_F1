package com.example.pia.repositories;

import com.example.pia.models.TeamsModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public interface TeamsRepository extends CrudRepository<TeamsModel, Long> {
    public abstract ArrayList<TeamsModel> findByPosition(int position);

    public abstract ArrayList<TeamsModel> deleteByPosition(int position);
}
