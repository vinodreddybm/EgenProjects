package com.test;

import static org.mockito.Mockito.when;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {
	
	//@InjectMocks annotation is used to create and inject the mock object
	   @InjectMocks 
	   MathApplication mathApplication = new MathApplication();

	   //@Mock annotation is used to create the mock object to be injected
	   @Mock
	   CalculatorService calcService;

	   @Test
	   public void testAdd(){
	      //add the behavior of calc service to add two numbers
	     when(calcService.add(10.0,20.0)).thenReturn(40.00);
			
	      //test the add functionality
	      Assert.assertEquals(mathApplication.add(10.0, 20.0),40.0,0);
	   }

}	
