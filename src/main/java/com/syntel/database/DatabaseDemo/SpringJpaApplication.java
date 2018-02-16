package com.syntel.database.DatabaseDemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.syntel.database.DatabaseDemo.entity.Person;
import com.syntel.database.DatabaseDemo.jpa.PersonJpaRepository;

@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner{
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJpaRepository jpa;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("user id 10001 -> {}",jpa.findById(10001).toString());
		jpa.insert(new Person("Candy Moore", "Oldsmar", new Date()));
		jpa.update(new Person(10001,"scottmama","tampa",new Date()));
		jpa.deleteById(10004);
		logger.info("All users => {}",jpa.findAll());
	}
	
}
