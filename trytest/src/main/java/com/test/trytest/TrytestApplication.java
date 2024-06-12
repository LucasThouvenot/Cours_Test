package com.test.trytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrytestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrytestApplication.class, args);
		Calculatrice calc = new Calculatrice();
		System.out.println(calc.Add(3,7));
		System.out.println(calc.Subsract(3,7));
		System.out.println(calc.Divide(3,7));
		System.out.println(calc.Multiply(3,7));
	}

}
