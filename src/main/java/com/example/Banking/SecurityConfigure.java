package com.example.Banking;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfigure extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
		    .antMatchers("/balance").authenticated()
		    .antMatchers("/home").permitAll()
		    .antMatchers("/about").permitAll()
		    .antMatchers("/contact").permitAll()
		    .and().formLogin()
		    .and().httpBasic();
		
		
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication()
		    .withUser("srija").password("srija").authorities("admin").and()
		    .withUser("naveen").password("naveen").authorities("user").and()
		    .withUser("suvarna").password("suvarna").authorities("user").and()
		    .withUser("navasri").password("navasri").authorities("user").and()
		    .withUser("srinav").password("srinav").authorities("user").and()
		    .withUser("bujji").password("bujji").authorities("user").and().passwordEncoder(NoOpPasswordEncoder.getInstance());
		}
	
	
	

}
