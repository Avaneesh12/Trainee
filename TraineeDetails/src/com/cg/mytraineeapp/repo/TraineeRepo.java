package com.cg.mytraineeapp.repo;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.mytraineeapp.beans.Trainee;


public interface TraineeRepo extends JpaRepository<Trainee, Integer> {
	@Query("SELECT c from Trainee c where c.traineeLocation=:traineeLocation")    
	public List<Trainee> getallTrainee(@Param("traineeLocation") String city);
}