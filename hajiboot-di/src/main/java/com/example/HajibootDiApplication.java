package com.example;

//2-1-2
//Autowiredしない場合
/*
import com.example.app.Argument;
import com.example.app.ArgumentResolver;
import com.example.app.Calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@Import(AppConfig.class)
public class HajibootDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HajibootDiApplication.class, args);
		
		//Autowiredしない場合
		System.out.print("Enter 2 numbers like 'a b' : ");
		ArgumentResolver argumentResolver = context.getBean(ArgumentResolver.class);
		Argument argument = (Argument) argumentResolver.resolve(System.in);
		
		Calculator calculator = context.getBean(Calculator.class);
		int result = calculator.calc(argument.getA(), argument.getB());
		
		System.out.println("result = " + result);
		
		
	}
}
*/







//2-1-3
//Autowiredする場合
/*
import com.example.app.Fronted;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@Import(AppConfig.class)
public class HajibootDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HajibootDiApplication.class, args);
		
		//Autowiredする場合
		Fronted fronted = context.getBean(Fronted.class);
		fronted.run();
	}
}
*/


//2-1-4
/*
//Autowired面倒だという人には、ComponentScanがおすすめ
import com.example.app.Fronted;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@EnableAutoConfiguration
@ComponentScan
public class HajibootDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HajibootDiApplication.class, args);
		
		//ComponentScanする場合
		Fronted fronted = context.getBean(Fronted.class);
		fronted.run();
	}
}
*/



/*
//2-1-4
//@EnableAutoConfigration @Configration @ComponentScanを含む「SpringBootApplication」アノテーションを使って書き直すと
import com.example.app.Fronted;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication; //これが　@EnableAutoConfigration @Configration @ComponentScanを含む
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HajibootDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(HajibootDiApplication.class, args);
		
		//ComponentScanする場合
		Fronted fronted = context.getBean(Fronted.class);
		fronted.run();
	}
}
*/

//2-1-5
//ComandLineRunnerというInterfaceのがあるので、それを使うとDependencyIngectionが使える
//import com.example.app.Fronted;
import com.example.app.Argument;
import com.example.app.ArgumentResolver;
import com.example.app.Calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication; //これが　@EnableAutoConfigration @Configration @ComponentScanを含む

@SpringBootApplication
public class HajibootDiApplication implements CommandLineRunner {

	@Autowired
	ArgumentResolver argumentResolver;
	
	@Autowired
	Calculator calculator;
	
	@Override
	public void run(String... string) throws Exception {
		System.out.print("Enter 2 number like 'a b' : ");
		Argument argument = argumentResolver.resolve(System.in);
		int result = calculator.calc(argument.getA(), argument.getB());
		System.out.println("result = " + result);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HajibootDiApplication.class, args);
		
	}
}
