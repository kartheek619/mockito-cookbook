package com.java.mockito;

import com.java.mockito.general.Person;

public interface TaxService {
	
	double getCurrentTaxFactorFor(Person person);
	String getInternalRevenueServiceAddress(String countryName);
	double calculateTaxFactorFor(Person person);
	

}
