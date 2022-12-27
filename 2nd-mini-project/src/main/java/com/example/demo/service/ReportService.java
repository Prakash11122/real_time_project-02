package com.example.demo.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.example.demo.binding.CitizenPlan;
import com.example.demo.binding.SearchRequest;

public interface ReportService {
	public List<String>getPlanNames();
	
	public List<String>getPlanStatuses();
	
	public List<CitizenPlan> getCitizenPlans(SearchRequest request);
	
	public void exportExcel(HttpServletResponse response)throws Exception;
	
	public void exportPdf(HttpServletResponse response) throws Exception;

}
