package com.josemina.literalura;

import com.josemina.literalura.main.Main;
import com.josemina.literalura.repository.AuthorRepository;
import com.josemina.literalura.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterAluraApplication implements CommandLineRunner {
	private final BookRepository bookRepository;
	private final AuthorRepository authorRepository;

	public LiterAluraApplication(BookRepository bookRepository, AuthorRepository authorRepository) {
		this.bookRepository = bookRepository;
		this.authorRepository = authorRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(LiterAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Main main = new Main(bookRepository, authorRepository);
		main.showMenu();
	}
}
