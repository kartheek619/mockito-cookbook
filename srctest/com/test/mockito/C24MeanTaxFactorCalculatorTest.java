package com.test.mockito;

import org.mockito.internal.stubbing.answers.ThrowsExceptionClass;

import com.java.mockito.C2MeanTaxFactorCalculator;
import com.java.mockito.TaxService;
import com.java.mockito.general.Person;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.*;

public class C24MeanTaxFactorCalculatorTest {

	TaxService taxService = mock(TaxService.class, new ThrowsExceptionClass(IllegalStateException.class));
	
	C2MeanTaxFactorCalculator systemUnderTest = new C2MeanTaxFactorCalculator(taxService);
	
	@Test
	public void should_throw_exception_when_calculating_mean_tax_factor(){
		
		try {	
			systemUnderTest.calculateMeanTaxFactorFor(new Person());
			fail("Test Fail!Should throw exception and this statement shouldnt be executed");
		} catch (IllegalStateException exception) {
			
			System.out.println("Excepion Successfully Caught! Test Passed!");
			
		}
	}
	
}
