package com.api.registroalumno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.api.registroalumno.security.AutorizaJsonWebToken;

@SpringBootApplication
public class RegistroalumnoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistroalumnoApplication.class, args);
	}

	@EnableWebSecurity
	@Configuration
	class WebSecurityConfig extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.csrf().disable()
				.addFilterAfter( new AutorizaJsonWebToken(), UsernamePasswordAuthenticationFilter.class)
				.authorizeRequests()
				.antMatchers("/registroalumno/login").permitAll()
				.anyRequest().authenticated();
		}
	}
}
