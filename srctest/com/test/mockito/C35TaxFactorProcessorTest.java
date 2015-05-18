package com.test.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.BDDMockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import com.java.mockito.C3TaxFactorProcessor;
import com.java.mockito.C3TaxService;
import com.java.mockito.general.Person;

@RunWith(MockitoJUnitRunner.class)
public class C35TaxFactorProcessorTest {
	
	@Spy C3TaxService taxService;
	
	@InjectMocks C3TaxFactorProcessor systemUnderTest;
	
	@Test
	public void testFactorProcessorFor(){
	
		double taxFactor = systemUnderTest.processTaxFactorFor(new Person());
		given(taxService.calculateTaxFactorFor(any(Person.class))).willCallRealMethod();
		
		assertEquals(C3TaxService.DEFAULT_TAX_FACTOR, taxFactor, 1e-8);
	}
	
	

}
