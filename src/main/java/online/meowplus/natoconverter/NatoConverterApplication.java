package online.meowplus.natoconverter;

import ch.qos.logback.core.encoder.JsonEscapeUtil;
import online.meowplus.natoconverter.repository.AlphabetMapping;
import org.apache.logging.log4j.util.Chars;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

@SpringBootApplication
public class NatoConverterApplication implements CommandLineRunner {

	private AlphabetMapping alphabetMapping;

	public NatoConverterApplication(AlphabetMapping alphabetMapping) {
		this.alphabetMapping = alphabetMapping;
	}

	public static void main(String[] args) {
		SpringApplication.run(NatoConverterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("NATO Phonetic Converter v1.0.0");

			// input string from user
			System.out.print("Enter a string to convert: ");
			String input = scanner.nextLine();

			// exit flag
			if (input.equals("!q")) {
				System.exit(0);
			}

			// convert to nato
			if (!input.isEmpty()) {

				System.out.println("=".repeat(13 + input.length()));
				System.out.print("Password is: ");
				System.out.println(input);
				System.out.println("=".repeat(13 + input.length()));
				System.out.println("Alphabet Mapping: ");

				// remove " " from input
				input = input.replace(" ", "");

				// show result to screen
				System.out.println(
						Arrays.stream(input.split(""))
								.map(s -> alphabetMapping.getMapping(s.charAt(0)))
								.collect(Collectors.joining(" "))
				);

				// enter to continue
				System.out.println();
				System.out.print("Press ENTER to continue...");
				scanner.nextLine();

			}
		}
	}

}
