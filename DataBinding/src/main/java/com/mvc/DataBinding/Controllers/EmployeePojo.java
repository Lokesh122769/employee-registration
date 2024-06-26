package com.mvc.DataBinding.Controllers;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmployeePojo
{
   @Id
   private String fname;
   
   
   private String lname;
   
   private String ecity;
   
   private Double esal;
   
   private String edomain;

   public EmployeePojo()
   {
	super();
   }
   
		public String getEdomain() {
			return edomain;
		}
		
		
		public void setEdomain(String domain) {
			this.edomain = domain;
		}



		public String getFname() {
			return fname;
		}
		
		
		public void setFname(String fname) {
			this.fname = fname;
		}
		
		
		public String getLname() {
			return lname;
		}
		
		
		public void setLname(String lname) {
			this.lname = lname;
		}
		
		
		public String getEcity() {
			return ecity;
		}
		
		
		public void setEcity(String ecity) {
			this.ecity = ecity;
		}
		
		
		public Double getEsal() {
			return esal;
		}
		
		
		public void setEsal(Double esal) {
			this.esal = esal;
		}
		
		
		@Override
		public String toString()
		{
			return "EmployeePojo [fname=" + fname + ", lname=" + lname + ", ecity=" + ecity + ", esal=" + esal + "]";
		}
		   
   

}
