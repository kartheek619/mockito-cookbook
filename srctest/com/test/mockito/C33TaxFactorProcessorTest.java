package com.test.mockito;

import java.io.Serializable;

import org.junit.Test;

import com.java.mockito.C3TaxFactorProcessor;
import com.java.mockito.C3TaxService;
import com.java.mockito.general.Person;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyDouble;
import static org.mockito.Mockito.*;

public class C33TaxFactorProcessorTest {
	
	C3TaxService taxService = mock(C3TaxService.class, withSettings().serializable().spiedInstance(new C3TaxService()).defaultAnswer(CALLS_REAL_METHODS));
	
	C3TaxFactorProcessor systemUnderTest = new C3TaxFactorProcessor(taxService);

	@Test
	public void testProcessTaxFactorFor(){
		
		double taxFactor = systemUnderTest.processTaxFactorFor(new Person());
		doNothing().when(taxService).updateTaxData(anyDouble(), any(Person.class));
		
		assertEquals(C3TaxService.DEFAULT_TAX_FACTOR, taxFactor, 1e-8);
		assertThat(taxService, instanceOf(Serializable.class));
	}
}
