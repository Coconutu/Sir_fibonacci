package com.sir_fibonacci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sir_fibonacci.service.FibonacciService;

@RestController
public class FibonacciController {
	
	@Autowired
    public FibonacciService fibonacciService;
	@RequestMapping(value = "/fibonacci",method = RequestMethod.GET)
	public String GetFibonacci()
	{
	return "Sirul lui Fibonacci (primele 45 de elemente) :"+fibonacciService.GetFibonacci();
	}
	

}
