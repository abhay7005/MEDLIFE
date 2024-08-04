
package com.medlife.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.medlife.api.security.CustomUserDetailService;
/**
 * @author Abhay
 *
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	public CustomUserDetailService customUserDetilService;

	@Autowired
	private JwtAuthenticationFilter jwtFilter;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(customUserDetilService).passwordEncoder(bCryptPasswordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests()
		.antMatchers("/auth/**").permitAll()
		.and()
		.authorizeRequests()
		.antMatchers("/admin/**","/actuator/**").hasRole("ADMIN") // ADMIN USER
				.antMatchers("/appointment/**","/receptionist/**").hasRole("RECEPTIONIST") // RECEPTIONIST USER
				.antMatchers("/doctor/**").hasRole("DOCTOR") // DOCTOR USER
				.antMatchers("/pharmacist/**").hasRole("PHARMACIST") // PHARMACIST USER
				.antMatchers("/swagger-ui.html","/user/**").hasAnyRole("ADMIN","RECEPTIONIST","DOCTOR","PHARMACIST")

				

				.anyRequest().authenticated().and().httpBasic();
		http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/v2/api-docs", "/configuration/ui", "/swagger-resources/**",
				"/configuration/security", "/webjars/**");
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder(10);
	}

	@Bean
	public AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}

}