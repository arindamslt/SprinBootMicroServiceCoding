package com.arindam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class BootJdbcApplication implements CommandLineRunner {
    @Autowired
	private JdbcTemplate template;
	public static void main(String[] args) {
		SpringApplication.run(BootJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	String insert_sql="insert into account values('100','RAMAN',15000.00)";
	 String select_sql="select * from account";
		int n=template.update(insert_sql);
		System.out.println("THE NUMBER OF ROWS EFFECTED:"+n);
		List aclist=template.queryForList(select_sql);
		System.out.println(aclist);
		
	}

}
