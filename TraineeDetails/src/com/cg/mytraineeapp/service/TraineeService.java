package com.cg.mytraineeapp.service;


import java.util.List;

import com.cg.mytraineeapp.beans.Trainee;
public interface TraineeService
{
	public Trainee addTrainee(Trainee trainee);
	public void deleteTrainee(int id);
	public Trainee modifyTrainee(Trainee trainee);
	public List<Trainee> showTrainee(String city);
	public Trainee showDetails (int id);
}
