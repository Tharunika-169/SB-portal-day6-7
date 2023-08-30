package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Studententity;
import com.example.demo.repository.Employeerepo;

@Service
public class Employeeservice {
	
	@Autowired
	Employeerepo er;
	
	@PostMapping("addemployee")
	public Studententity saveinfo(Studententity ss)
	{
		return er.save(ss);
	}
	@GetMapping("showemployee")
	public List<Studententity> showinfo()
	{
		return er.findAll();
	}

}
