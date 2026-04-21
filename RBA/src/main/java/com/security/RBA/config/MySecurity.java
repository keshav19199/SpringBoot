	package com.security.RBA.config;
	
	import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
	import org.springframework.security.config.Customizer;
	import org.springframework.security.config.annotation.web.builders.HttpSecurity;
	import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
	import org.springframework.security.core.userdetails.User;
	import org.springframework.security.core.userdetails.UserDetails;
	import org.springframework.security.core.userdetails.UserDetailsService;
	import org.springframework.security.provisioning.InMemoryUserDetailsManager;
	import org.springframework.security.web.SecurityFilterChain;
	
	@Configuration
	@EnableWebSecurity
	public class MySecurity {
		
		
		@Bean
		public SecurityFilterChain mysecurity(HttpSecurity request) throws Exception
		{
			return request.csrf((security)->{security.disable();})
					.authorizeHttpRequests((req)->{
						req.requestMatchers(HttpMethod.GET).permitAll()
						.anyRequest().authenticated();
					})
					.httpBasic(Customizer.withDefaults())
					.build();
			
		}
		
		
		@Bean
		public UserDetailsService myuser()
		{
			UserDetails user1=User.builder().username("Keshav").password("{noop}kw@123").build();
			UserDetails user2=User.builder().username("Karan").password("{noop}ka@123").build();
			
			return new InMemoryUserDetailsManager(user1,user2);
		
		}
	
	}
