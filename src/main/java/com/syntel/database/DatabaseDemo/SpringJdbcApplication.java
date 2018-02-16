package com.syntel.database.DatabaseDemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.syntel.database.DatabaseDemo.entity.Person;
import com.syntel.database.DatabaseDemo.jdbc.PersonJdbcDao;

@SpringBootApplication
public class SpringJdbcApplication implements CommandLineRunner{
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}",dao.findAll());
		logger.info("User id 10001->{}",dao.findById(10001));
		logger.info("Deleting 10002 ->No of rows deleted is {}",dao.deleteById(10002));
		logger.info("Inserting 10005 ->{}",
				dao.insertPerson(new Person(10005, "AlBoraski", "Oldsmar", new Date())));
		logger.info("Updating the id 10001 {}",dao.updateById(new Person(10001, "scotmama", "Tampa", new Date())));
		logger.info("All users -> {}",dao.findAll());
	}
	
}
