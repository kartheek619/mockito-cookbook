package com.test.mockito;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.java.mockito.C2TaxFactorCalculator;
import com.java.mockito.TaxService;
import com.java.mockito.general.Person;

@RunWith(PowerMockRunner.class)
@PrepareForTest(TaxService.class)
public class C27TaxFactorCalculatorTest {
	
	static final double TAX_FACTOR = 10000;

    @Mock TaxService taxService;

    @InjectMocks C2TaxFactorCalculator systemUnderTest;

    @Test
    public void should_calculate_tax_factor() {
        
        given(taxService.calculateTaxFactorFor(Mockito.any(Person.class))).willReturn(TAX_FACTOR);

        
        double taxFactorForPerson = systemUnderTest.calculateTaxFactorFor(new Person());

        assertEquals(TAX_FACTOR, taxFactorForPerson, 1e-8);
	    
    }	

}
