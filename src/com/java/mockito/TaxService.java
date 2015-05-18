package com.java.mockito;

import com.java.mockito.general.Person;

public interface TaxService {
	
	public static final double DEFAULT_TAX_FACTOR = 0.5;
	double getCurrentTaxFactorFor(Person person);
	String getInternalRevenueServiceAddress(String countryName);
	double calculateTaxFactorFor(Person person);
		
	
	public void updateTaxData(double taxfactor, Person person);
	

}
