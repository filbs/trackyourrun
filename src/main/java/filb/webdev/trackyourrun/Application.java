package filb.webdev.trackyourrun;

import filb.webdev.trackyourrun.run.Location;
import filb.webdev.trackyourrun.run.Run;
import filb.webdev.trackyourrun.run.RunRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScans;

import java.time.LocalDateTime;

@SpringBootApplication

public class Application {

	public static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

//	@Bean
//	CommandLineRunner runner(RunRepository runRepository){
//		return args -> {
//			Run run = new Run(1, "First run", LocalDateTime.now(), LocalDateTime.now().plusHours(1), 5, Location.OUTDOOR);
//			runRepository.create(run);
//		};
//	}

}
