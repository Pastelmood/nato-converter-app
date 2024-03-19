package online.meowplus.natoconverter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NatoConverterApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(NatoConverterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
