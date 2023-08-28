package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.ChildModel;

public interface ChildRepo extends JpaRepository<ChildModel,Integer> {

}
