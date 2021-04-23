package com.caltech.calculator;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class CalculatorApplicationTests {
    
    private CalculatorApplication calc = new CalculatorApplication();
    @Test	 
    public void testRandomNumber() {       	 	    	
 	 	  	   assertTrue(calc.getRandomTicketNumber()>1000&&calc.getRandomTicketNumber()<9999);	 
    }


}
