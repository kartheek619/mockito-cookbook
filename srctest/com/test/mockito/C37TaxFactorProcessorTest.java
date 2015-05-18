package com.test.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.core.classloader.annotations.PrepareForTest;


import com.java.mockito.C3TaxFactorProcessor;
import com.java.mockito.C3TaxService;
import com.java.mockito.general.Person;

@RunWith(PowerMockRunner.class)
@PrepareForTest(C3TaxService.class)
public class C37TaxFactorProcessorTest {

	static final double TAX_FACTOR = 10000;

    @Spy C3TaxService taxService = new C3TaxService();

    @InjectMocks C3TaxFactorProcessor systemUnderTest;

    @Test
    public void should_return_default_tax_factor_for_person_from_undefined_country() {
        
        doReturn(TAX_FACTOR).when(taxService).calculateTaxFactorFor(Mockito.any(Person.class));
        double taxFactorForPerson = systemUnderTest.processTaxFactorFor(new Person());

	    assertEquals(TAX_FACTOR, taxFactorForPerson, 1e-8);
    }
	
}
