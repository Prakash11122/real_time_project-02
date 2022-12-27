package com.example.demo.rest;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.binding.CitizenPlan;
import com.example.demo.binding.SearchRequest;
import com.example.demo.service.ReportService;

@RestController
public class ReportRestController {
	@Autowired
	private ReportService reportService;
	
	@GetMapping("/planname")
	public ResponseEntity<List<String>> getPlanNames(){
		List<String> planNames = reportService.getPlanNames();
		return new ResponseEntity<>(planNames,HttpStatus.OK);
		
	}
	@GetMapping("/planstatus")
	public ResponseEntity<List<String>> getPlanStatuses(){
		List<String> planNames = reportService.getPlanStatuses();
		return new ResponseEntity<>(planNames,HttpStatus.OK);
		
	}
	@PostMapping("/search")
	public ResponseEntity<List<CitizenPlan>> search(@RequestBody SearchRequest request){
		List<CitizenPlan> citizenPlan = reportService.getCitizenPlans(request);
		return new ResponseEntity<>(citizenPlan,HttpStatus.OK);
	}
	@GetMapping("/export")
	public void exportExcel(HttpServletResponse response) throws Exception {
		
		response.setContentType("application/octet-stream");
		String key = "content-Disposition";
		String value = "attachment;filename=citizens.xls";
		
		response.setHeader(key, value);
		
		reportService.exportExcel(response);
		response.flushBuffer();
	
	}
	@GetMapping("/pdf")
	public void exportPdf(HttpServletResponse response) throws Exception{
		response.setContentType("application/pdf");
		String key = "content-Disposition";
		String value = "attachment;filename=plans.pdf";
		response.setHeader(key, value);
		reportService.exportPdf(response);
		response.flushBuffer();
		 
		
	}
	
	

}
 