package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Machine;

public interface MachRepo extends JpaRepository<Machine,Integer>{

}
