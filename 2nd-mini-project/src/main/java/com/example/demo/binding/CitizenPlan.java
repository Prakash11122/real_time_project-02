package com.example.demo.binding;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "CITIZENS_PLAN_INFO")
public class CitizenPlan {
	@Id
	@GeneratedValue
	private Integer cid;
	private String planName;
	private String planStatus;
	private String cname;
	private String cemail;
	private String gender;
	private Long phno;
	private double ssn;
	

}
