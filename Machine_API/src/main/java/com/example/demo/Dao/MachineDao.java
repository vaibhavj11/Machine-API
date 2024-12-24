package com.example.demo.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Machine;
import com.example.demo.Repository.MachRepo;
import com.example.demo.Service.MachineService;

@Service
public class MachineDao implements MachineService {

	@Autowired
	MachRepo mr;

	@Override
	public void addMachine(Machine machine) {
		// TODO Auto-generated method stub
		 mr.save(machine);
	}

	@Override
	public Optional<Machine> getMachineById(Integer mid) {
		return mr.findById(mid);
	}

	@Override
	public List<Machine> getAllMachines(Machine machine) {
		// TODO Auto-generated method stub
		return mr.findAll();
	}

	@Override
	public void updateMachineInfo(Machine machine, Integer mid) {
		// TODO Auto-generated method stub
		mr.save(machine);
	}

	@Override
	public void deleteMachineService(Integer mid) {
		// TODO Auto-generated method stub
		mr.deleteById(mid);
	}

	
	
}
