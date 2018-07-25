package com.cg.mytraineeapp.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.mytraineeapp.beans.Trainee;
import com.cg.mytraineeapp.repo.TraineeRepo;
@Component(value="traineeService")
public class TraineeServiceImpl implements TraineeService {
	@Autowired
	public TraineeRepo repo;
	
	public Trainee addTrainee(Trainee trainee)  {
		return repo.save(trainee);	
	}
	
	
	@Override
	public void deleteTrainee(int id) {
	repo.delete(id);
	}

	@Override
	public Trainee modifyTrainee(Trainee trainee) {
		return repo.save(trainee);
	}

	@Override
	public List<Trainee> showTrainee(String city) {
	List<Trainee>trainee=repo.getallTrainee(city);
	return trainee;
	}


	@Override
	public Trainee showDetails(int id) {
		
		return repo.findOne(id);
	}
}