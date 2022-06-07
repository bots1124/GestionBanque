package com.Banque;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.Banque.dao.ClientRepository;
import com.Banque.dao.CompteRepository;
import com.Banque.dao.OperationRepository;
import com.Banque.entities.Client;
import com.Banque.entities.Compte;
import com.Banque.entities.CompteCourant;
import com.Banque.entities.CompteEpargne;
import com.Banque.entities.Retrait;
import com.Banque.entities.Versement;
import com.Banque.service.IBanqueMetier;

@SpringBootApplication
public class GestionDesComptesBancairesApplication implements CommandLineRunner {

	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private CompteRepository compteReposiory;
	@Autowired
	private OperationRepository operationRepository;
	@Autowired
	private IBanqueMetier banqueMetier;
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(GestionDesComptesBancairesApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	

	}

}
