package com.test.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.BDDMockito.*;

import com.java.mockito.C2MeanTaxFactorCalculator;
import com.java.mockito.TaxService;
import com.java.mockito.general.Person;

@RunWith(MockitoJUnitRunner.class)
public class C23MeanTaxFactorCalculatorTest {
	
	static final double TAX_FACTOR = 10;
	
	@Mock TaxService taxService;
	
	@InjectMocks C2MeanTaxFactorCalculator systemUnderTest;
	
	@Test
	public void testC2MeanTaxFactorCalculator() {
		
		given(taxService.getCurrentTaxFactorFor(any(Person.class))).willReturn(TAX_FACTOR);
		double meanTaxFactor = systemUnderTest.calculateMeanTaxFactorFor(new Person());
		assertEquals(TAX_FACTOR, meanTaxFactor, 1e-8);
		
		
	}
	

}
