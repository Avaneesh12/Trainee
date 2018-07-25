package com.cg.mytraineeapp.controllers;
import java.math.BigDecimal;
import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.mytraineeapp.beans.Trainee;
import com.cg.mytraineeapp.service.TraineeService;
@Controller
public class CustomerActionController
{
	@Autowired
	TraineeService traineeServices;
	@RequestMapping(value="/registerTrainee")
	public ModelAndView registerTrainee(@Valid @ModelAttribute("trainee") Trainee trainee,BindingResult result) {
		try {
			if(result.hasErrors()) return new ModelAndView("registerationPage");
			trainee= traineeServices.addTrainee(trainee);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("registrationSuccessPage","trainee",trainee);
	}
	
	@RequestMapping(value="/getTrainee")
	public ModelAndView getTrainee(@ModelAttribute("trainee") Trainee trainee,BindingResult result) 
	{
		try {
			if(result.hasErrors()) return new ModelAndView("loginPage");
			trainee=traineeServices.showDetails(trainee.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
      if(trainee==null)
    	  return new ModelAndView("loginFailPage","trainee",trainee);

		return new ModelAndView("loginSuccessPage","trainee",trainee);

	}
	
	@RequestMapping(value="/updatePage")
	public ModelAndView updatePage(@ModelAttribute("trainee") Trainee trainee) 
			{
			Trainee t =traineeServices.modifyTrainee(trainee);
			 if(t==null)
		    	  return new ModelAndView("loginFailPage","trainee",t);
		return new ModelAndView("updateSuccessPage","trainee",t);

	}
	@RequestMapping(value="/deletePage")
	public ModelAndView deletePage(@RequestParam("id")int x) 
			{
			traineeServices.deleteTrainee(x);
	           ModelAndView mv=new ModelAndView();
	           mv.setViewName("deleteSuccessPage");
	           mv.addObject("result","your account has been deleted");
	           return mv;
	
	}
	@RequestMapping(value="/transactionPage")
	public ModelAndView transPage(@RequestParam("city") String v){
List<Trainee>list=traineeServices.showTrainee(v);
ModelAndView mv=new ModelAndView();
mv.setViewName("transaction_Success");
mv.addObject("list",list);
return mv;
}
	
}
