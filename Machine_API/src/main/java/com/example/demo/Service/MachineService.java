package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Model.Machine;

public interface MachineService {

	void addMachine(Machine machine);

	Optional<Machine> getMachineById(Integer mid);
	
	List<Machine> getAllMachines(Machine machine);

	void updateMachineInfo(Machine machine, Integer mid);

	void deleteMachineService(Integer mid);

	

}
