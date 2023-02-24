package com.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCrudStudyECartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudStudyECartApplication.class, args);
	}

}

//workflow: main()>controller>service>repository>model