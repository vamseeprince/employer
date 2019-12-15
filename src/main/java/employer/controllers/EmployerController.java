package employer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import employer.models.EmployerList;
import employer.repositories.EmployerRepository;

@RestController
@RequestMapping("/employer")
public class EmployerController {
	
	@Autowired
	private EmployerRepository employerRepo;
	
	@RequestMapping("/employers")
	public EmployerList getEmployers(){
		EmployerList el = new EmployerList();
		el.setEmployers(employerRepo.findAll());
		return el;
	}
}
