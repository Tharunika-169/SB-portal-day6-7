package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Studententity;

public interface Employeerepo extends JpaRepository<Studententity,Integer> {

}
