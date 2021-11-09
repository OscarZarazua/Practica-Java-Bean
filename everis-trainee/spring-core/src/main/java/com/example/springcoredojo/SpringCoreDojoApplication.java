package com.example.springcoredojo;

import com.example.springcoredojo.NTT.Configuracion;
import com.example.springcoredojo.NTT.Usuario;
import com.example.springcoredojo.NTT.Youtuber;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreDojoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDojoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			javaAnonotated();
			classPathXmlApplicationContext();
		};
	}

	public void javaAnonotated(){
		ApplicationContext context = new AnnotationConfigApplicationContext(Configuracion.class);

		Usuario usuario = context.getBean("usuario", Usuario.class);

		System.out.println("Alumno: " + usuario.getAlumno());
	}
	public void classPathXmlApplicationContext(){
		ApplicationContext context = new ClassPathXmlApplicationContext("user-bean-config.xml");
		Youtuber youtuber = context.getBean(Youtuber.class);

		System.out.println("Youtuber: " + youtuber.getNombre());
	}

}