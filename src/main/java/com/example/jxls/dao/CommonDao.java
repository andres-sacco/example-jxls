package com.example.jxls.dao;

import com.example.jxls.model.Client;
import com.github.javafaker.Faker;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CommonDao {
	
	public List<Client> getAllClients() {
		
		List<Client> clients = new ArrayList<>();
		Faker faker = new Faker();

		for (int i = 0; i < 20; i++) {
			clients.add(new Client(faker.name().firstName(), 
					faker.name().lastName(), 
					faker.bool().bool(),
					"SSN",
					faker.idNumber().ssnValid(),
					BigDecimal.valueOf(faker.number().numberBetween(1, 100000))));
		}
		
		return clients;
	}
}
