package com.test.mockito;


import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Answers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.java.mockito.C2TaxFactorInformationProvider;
import com.java.mockito.TaxService;
import com.java.mockito.general.Person;


@RunWith (MockitoJUnitRunner.class)
public class C25TaxFactorInformationProviderTest {
	
	@Mock(answer= Answers.RETURNS_SMART_NULLS) TaxService taxService;
	
	
	@InjectMocks C2TaxFactorInformationProvider systemUnderTest;
	
	@Test
	
	public void testFormatIrsAddress(){
		
		String actual = systemUnderTest.formatIrsAddress(new Person());
		String expected = "IRS:[]";
		System.out.println(actual);
		assertEquals(expected,actual);
	}

}
