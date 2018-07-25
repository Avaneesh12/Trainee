package com.cg.mytraineeapp.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;
@Entity
@Table(name="Trainee")
public class Trainee implements Serializable 
{
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String traineeName;
	String traineeLocation;
	String traineeDomain;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getTraineeLocation() {
		return traineeLocation;
	}
	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}
	public String getTraineeDomain() {
		return traineeDomain;
	}
	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}
	public Trainee(int id, String traineeName, String traineeLocation, String traineeDomain) {
		super();
		this.id = id;
		this.traineeName = traineeName;
		this.traineeLocation = traineeLocation;
		this.traineeDomain = traineeDomain;
	}
	@Override
	public String toString() {
		return "Trainee [id=" + id + ", traineeName=" + traineeName + ", traineeLocation=" + traineeLocation
				+ ", traineeDomain=" + traineeDomain + "]";
	}
	public Trainee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
