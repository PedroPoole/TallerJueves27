package flux;

import java.time.Duration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.annotation.ObjectIdGenerators.IntSequenceGenerator;

import reactor.core.publisher.Flux;


@SpringBootApplication
public class PedroPooleFluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(PedroPooleFluxApplication.class, args);
		
		

		
	}

}
