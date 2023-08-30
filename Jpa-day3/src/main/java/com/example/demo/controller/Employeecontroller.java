package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Studententity;
import com.example.demo.service.Employeeservice;

@RestController
public class Employeecontroller {
	@Autowired
	Employeeservice eee;
	@PostMapping("addemployee")
	public Studententity add(@RequestBody Studententity ss)
	{
		return eee.saveinfo(ss);
	}
	@GetMapping("showme")
	public List<Studententity>show()
	{
		return eee.showinfo();
	}
	

}
