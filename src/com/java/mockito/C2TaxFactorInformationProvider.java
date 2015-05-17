package com.java.mockito;
import com.java.mockito.TaxService;
import com.java.mockito.general.Person;

public class C2TaxFactorInformationProvider {
	
    private TaxService taxService;
    
	public C2TaxFactorInformationProvider(TaxService taxService){
		
		this.taxService = taxService;
		
	}
	
	public String formatIrsAddress (Person person){
		
		String irsAddress = taxService.getInternalRevenueServiceAddress(person.getCountryName());
		return "IRS:[" + irsAddress + "]";
		
	}

}
