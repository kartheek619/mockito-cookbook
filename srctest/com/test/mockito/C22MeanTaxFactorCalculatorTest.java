package com.test.mockito;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import static org.mockito.Matchers.any;
import static org.mockito.BDDMockito.*;


import org.junit.Test;

import com.java.mockito.C2MeanTaxFactorCalculator;
import com.java.mockito.TaxService;
import com.java.mockito.general.Person;


public class C22MeanTaxFactorCalculatorTest {
	
	static final double TAX_FACTOR = 10;
	  
	  TaxService taxService = mock(TaxService.class);

	  C2MeanTaxFactorCalculator systemUnderTest = new C2MeanTaxFactorCalculator(taxService);

	  
	@Test
	  public void testcalculateMeanTaxFactorFor() {
	    
	  given(taxService.getCurrentTaxFactorFor(any(Person.class))).willReturn(TAX_FACTOR);
	    
	  double meanTaxFactor = systemUnderTest.calculateMeanTaxFactorFor(new Person());
	   
	  assertEquals(TAX_FACTOR, meanTaxFactor, 1e-8);
	 }

}
