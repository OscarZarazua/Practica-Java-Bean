package com.example.springcoredojo.NTT;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackageClasses = Alumno.class)
public class Configuracion {
    @Bean
    public Alumno getAddress() {
        return new Alumno("Violet", "Martinez Reyes",23);
    }
}
