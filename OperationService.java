package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class OperationService {

	public StringBuffer findFibbonic(int nVal) {
		

		 int previousNumber = 0;
		 int nextNumber = 1;
		 StringBuffer result=new StringBuffer();
	       result.append("Fibonacci Series of ");
	       result.append(nVal);
	       result.append(" numbers: ");
 
	        for (int i = 1; i <= nVal; ++i)
	        {
	        	result.append(previousNumber+" ");
	            /* On each iteration, we are assigning second number
	             * to the first number and assigning the sum of last two
	             * numbers to the second number
	             */
 
	      
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	        }
 
		return result;
		
	}
}
