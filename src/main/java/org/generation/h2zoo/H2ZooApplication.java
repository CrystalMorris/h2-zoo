package org.generation.h2zoo;

import org.generation.h2zoo.model.Bird;
import org.generation.h2zoo.model.Primate;
import org.generation.h2zoo.model.Reptile;
import org.generation.h2zoo.repository.BirdRepository;
import org.generation.h2zoo.repository.PrimateRepository;
import org.generation.h2zoo.repository.ReptileRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class H2ZooApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext =
			SpringApplication.run(H2ZooApplication.class, args);
		//Reptile section
		ReptileRepository reptileRepository =
				configurableApplicationContext.getBean(ReptileRepository.class);

		Reptile kingCobra = new Reptile("Slither","Snake","Black & Yellow","Carnivore");
		Reptile komodoDragon = new Reptile("Dennis","Lizard","Brown", "Carnivore");
		reptileRepository.saveAll(List.of(kingCobra, komodoDragon));
		Reptile tuatara = new Reptile("Old Man","Tuatara","Brown & Grey","Carnivore");
		Reptile siameseCrocodile = new Reptile("Kitty","Crocodile","Olive-green","Carnivore");
		reptileRepository.saveAll(List.of(tuatara,siameseCrocodile));

		//Bird section
		BirdRepository birdRepository =
				configurableApplicationContext.getBean(BirdRepository.class);
		Bird lyrebird = new Bird("Pinnochio","Lyrebird","Neutral-colored","Carnivore");
		Bird raven = new Bird("Edgar","Raven", "Black", "Omnivore");
		Bird toucan = new Bird("Bucky","Toucan","Multicolored", "Frugivore");
		birdRepository.saveAll(List.of(lyrebird,raven,toucan));

		//Primate section
		PrimateRepository primateRepository =
				configurableApplicationContext.getBean(PrimateRepository.class);
		Primate slowLoris = new Primate("Bright Eyes","Slow Loris","Brown & Grey", "Omnivore");
		Primate javanGibbons = new Primate("Charley","Javan Gibbon","Blueish-grey","Herbivore");
		Primate human = new Primate("John Doe","Human","varies from pale ivory to dark brown","Omnivore");
		primateRepository.saveAll(List.of(slowLoris,javanGibbons,human));



	}

}
