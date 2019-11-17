package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.OperationService;

@RestController
@RequestMapping(path="/app")
public class OperationsController {
	
	@Autowired
	OperationService operationServiceObj;
	
	@RequestMapping(path="/getFibbonic")
	public StringBuffer getFibbonic(@RequestParam("nVal")int nVal ) {
		
		return operationServiceObj.findFibbonic(nVal);
		
	}

}
