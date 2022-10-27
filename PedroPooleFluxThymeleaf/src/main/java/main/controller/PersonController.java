package main.controller;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import main.persistence.Persona;
import main.services.PersonService;
import reactor.core.publisher.Flux;

@RestController
public class PersonController {

	
	
	@GetMapping("/personlist1")
	public Flux<Persona> personList1(){
		Flux<Persona> flux =Flux.just(new Persona("Tipo1","Apellido1",33)
				,new Persona("Tipo2","Apellido2",13)
				,new Persona("Tipo3","Apellido3",23))
			.delayElements(Duration.ofSeconds((long) (Math.random()+1*4)));
		
		return flux;
	}
	@GetMapping("/personlist2")
	public Flux<Persona> personList2(){
		Flux<Persona> flux =Flux.just
				(new Persona("Individuo1","Ap1",33)
				,new Persona("Individuo2","Ap2",13)
				,new Persona("Individuo3","Ap3",23))
				.delayElements(Duration.ofSeconds((long) (Math.random()+1*4)));
		
		return flux;
	}
	@GetMapping("/personlist3")
	public Flux<Persona> personList3(){
		Flux<Persona> flux =Flux.just
				(new Persona("Señor1","Ap1",53)
				,new Persona("Señor2","Ap2",63)
				,new Persona("Señor3","Ap3",63))
				.delayElements(Duration.ofSeconds((long) (Math.random()+1*4)));
		
		return flux;
	}
	@GetMapping("/personlist4")
	public Flux<Persona> personList4(){
		Flux<Persona> flux =Flux.just
				(new Persona("Personaje1","Ap1",33)
				,new Persona("Personaje2","Ap2",13)
				,new Persona("Personaje3","Ap3",23))
				.delayElements(Duration.ofSeconds((long) (Math.random()+1*4)));
		
		return flux;
	}
	
	
	
}
