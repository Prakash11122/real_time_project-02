package com.example.demo.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.demo.binding.CitizenPlan;
import com.example.demo.repo.CitizenPlanRepository;

@Component
public class DataInserter implements ApplicationRunner{
	
	@Autowired
	private CitizenPlanRepository repo;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		CitizenPlan cp1=new CitizenPlan();
		cp1.setCname("prakash");
		cp1.setGender("Male");
		cp1.setPhno(888489489l);
		cp1.setPlanName("SNAP");
		cp1.setPlanStatus("Approve");
		cp1.setSsn(98989898l);
		
		CitizenPlan cp2=new CitizenPlan();
		cp2.setCname("sudhir");
		cp2.setGender("Male");
		cp2.setPhno(87678489l);
		cp2.setPlanName("SNAP");
		cp2.setPlanStatus("Denied");
		cp2.setSsn(999998888l);
		
		CitizenPlan cp3=new CitizenPlan();
		cp3.setCname("priya");
		cp3.setGender("Fe-male");
		cp3.setPhno(8858848488l);
		cp3.setPlanName("CCAP");
		cp3.setPlanStatus("Apprived");
		cp3.setSsn(999444455l);
		
		CitizenPlan cp4=new CitizenPlan();
		cp4.setCname("Liza");
		cp4.setGender("Fe-male");
		cp4.setPhno(877777488l);
		cp4.setPlanName("CCAP");
		cp4.setPlanStatus("Denied");
		cp4.setSsn(55544455l);
		
	List<CitizenPlan> list=Arrays.asList(cp1,cp2,cp3,cp4);
	
	repo.saveAll(list);
		
	}
	

}
