package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Machine;
import com.example.demo.Service.MachineService;

@RestController
public class MachineController {

	@Autowired
	private MachineService ms;
	
	@PostMapping("/add")
	public Machine addMachine(@RequestBody Machine machine) {
	
		ms.addMachine(machine);
		
		System.out.println(machine);
		
	   return machine;	
		
	}
	
	@GetMapping("/{mid}")
	public Optional<Machine> getMachineInfoById(@PathVariable Integer mid) {
		
		return ms.getMachineById(mid);
	}
	
	@GetMapping("/getAll")
	public List<Machine> getAllMachines(Machine machine){
		return ms.getAllMachines(machine);
	}
	
	@PutMapping("/{mid}")
	public Machine updateMachineInfo(@RequestBody Machine machine,@PathVariable Integer mid) {
		
		ms.updateMachineInfo(machine,mid);
		
		return machine;
	}
	
	@DeleteMapping("/{mid}")
	public String deleteMachineInfo(@PathVariable Integer mid) {
		
		ms.deleteMachineService(mid);
		
		return "Machine Information deleted successfully !";
	}
	
}
