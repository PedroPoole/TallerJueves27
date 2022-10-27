package main.services;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import main.persistence.Persona;
import reactor.core.publisher.Flux;
@Service
public class PersonService {
    public Flux<Persona> allPersons(){
        Flux<Persona> p1= WebClient.create("http://localhost:8080/personlist1").get().retrieve().bodyToFlux(Persona.class);
        Flux<Persona> p2= WebClient.create("http://localhost:8080/personlist2").get().retrieve().bodyToFlux(Persona.class);
        Flux<Persona> p3= WebClient.create("http://localhost:8080/personlist3").get().retrieve().bodyToFlux(Persona.class);
        Flux<Persona> p4= WebClient.create("http://localhost:8080/personlist4").get().retrieve().bodyToFlux(Persona.class);
        
        Flux<Persona> allFlux= Flux.merge(p1,p2,p3,p4);
        return allFlux;
    }
}