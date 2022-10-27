package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import main.persistence.Persona;
import main.services.PersonService;
import reactor.core.publisher.Flux;



@Controller
public class AllPersonController {
	
	@Autowired
	PersonService personService;
	
	
	@GetMapping("/personlist")
	public String personlist(final Model model) {
		final Flux<Persona> personList=personService.allPersons();
		model.addAttribute("personlist", personList);
		return "personList";
	}
}
