package com.java.mockito;

import com.java.mockito.general.Person;

public class C2MeanTaxFactorCalculator {
	
	 private final TaxService taxService;

	    public C2MeanTaxFactorCalculator(TaxService taxService) {
	        this.taxService = taxService;
	    }

	    public double calculateMeanTaxFactorFor(Person person) {
	        double currentTaxFactor = taxService.getCurrentTaxFactorFor(person);
	        double anotherTaxFactor = taxService.getCurrentTaxFactorFor(person);
	        
	        return (currentTaxFactor + anotherTaxFactor) / 2;
	    }

}
