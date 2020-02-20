package com.kmit.clean_code;

public class calc_compound_interest {

	
	 public double CompoundInterest(double principal,double irate,double time,double n) {
		 
		 
		  double amount = principal * Math.pow(1 + (irate / (n*100)), n * time);
		  return amount - principal;
	  }
	 
	
	
	
	
	
	
	
	
}

