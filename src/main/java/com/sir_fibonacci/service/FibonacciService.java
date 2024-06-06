package com.sir_fibonacci.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class FibonacciService {
	public String GetFibonacci()
	{
		int a=0;
		int b=1;
		int c=0;
		int[] sir_fibonacci=new int[45];
		sir_fibonacci[0]=a;
		sir_fibonacci[1]=b;
		
		for (int i=2;i<45;i++)
		{
			
			c=a+b; 
			sir_fibonacci[i]=c;
			a=b;
			b=c;

			
		}
		String rezultat=Arrays.toString(sir_fibonacci);
		return rezultat;
		
	}

}
