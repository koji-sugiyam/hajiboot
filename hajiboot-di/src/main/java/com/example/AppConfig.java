package com.example;

import com.example.app.CalculatorAdd;
import com.example.app.ArgumentResolver;
import com.example.app.Calculator;
import com.example.app.ScannerArgumentResolver;
import com.example.app.Fronted;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	Calculator calculator() { //interface
		return new CalculatorAdd(); //implements class
	}

	@Bean
	ArgumentResolver argumentResolver() { //interface
		return new ScannerArgumentResolver(); //implements class
	}
	
	@Bean
	Fronted fronted() {
		return new Fronted();
	}
}