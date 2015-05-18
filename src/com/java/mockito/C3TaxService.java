package com.java.mockito;

import com.java.mockito.general.Person;

public class C3TaxService {
	
	public static final double DEFAULT_TAX_FACTOR = 0.5;
	
	public double calculateTaxFactorFor(Person person){
		
		return DEFAULT_TAX_FACTOR;
		
	}
		
	
	public void updateTaxData(double taxfactor, Person person){
		
	}
	

}
