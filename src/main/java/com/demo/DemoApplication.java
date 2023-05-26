package com.demo;

import com.demo.entity.CesBiweekly;
import com.demo.entity.CesBiweeklyPkId;
import com.demo.entity.StatusGovernance;
import com.demo.repository.CesBiweeklyRepo;
import com.demo.repository.StatusGovernanceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	CesBiweeklyRepo cesBiweeklyRepo;

	@Autowired
	StatusGovernanceRepo governanceRepo;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Override
	public void run(String... args) {
		CesBiweeklyPkId pkId = new CesBiweeklyPkId();
		pkId.setClient("Client");
		pkId.setProject("Project");

		CesBiweekly cesBiweekly = new CesBiweekly();
		cesBiweekly.setCesBiweeklyPkId(pkId);
		cesBiweekly.setNearshore(5);
		cesBiweekly.setProjectUniqueId(50);
		cesBiweekly.setGoGreenPlan("Plan");

		CesBiweekly save = cesBiweeklyRepo.save(cesBiweekly);

		StatusGovernance governance = new StatusGovernance();

		governance.setCesBiweekly(save);

		governance.setJanMbr(LocalDate.now());

		governanceRepo.save(governance);

		System.out.println("Saved success");


	}
}
