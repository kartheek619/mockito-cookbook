package com.test.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Mockito.doNothing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import com.java.mockito.C3TaxFactorProcessor;
import com.java.mockito.C3TaxService;
import com.java.mockito.general.Person;

@RunWith(MockitoJUnitRunner.class)
public class C34TaxFactorProcessorTest {
	
	@Spy C3TaxService taxService;
	
	@InjectMocks C3TaxFactorProcessor systemUnderTest;
	
	@Test
	public void testFactorProcessorFor(){
	
		double taxFactor = systemUnderTest.processTaxFactorFor(new Person());
		doNothing().when(taxService).updateTaxData(anyDouble(), any(Person.class));
		
		assertEquals(C3TaxService.DEFAULT_TAX_FACTOR, taxFactor, 1e-8);
	}
	
	

}
