package mc.springboot.rest.example.springbootjpawithhibernateandh2.security;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import mc.springboot.rest.example.springbootjpawithhibernateandh2.model.Users;
import mc.springboot.rest.example.springbootjpawithhibernateandh2.service.UserService;

@Configuration
@EnableWebSecurity
public class BasicConfiguration extends WebSecurityConfigurerAdapter {
 
	@Autowired
	UserService userService;


    @Override
    protected void configure(AuthenticationManagerBuilder auth)
      throws Exception {

		List<Users> usersList = userService.getUsersList();
		
		for (int i = 0; i < usersList.size(); i++) {
			Users user = usersList.get(i);
        auth
          .inMemoryAuthentication()
          .withUser(user.getUsername())
            .password(user.getPassword())
					.roles("USER");
           /* .and()
          .withUser("admin")
            .password("admin")
            .roles("USER", "ADMIN");*/
		}
		
    }
 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
          .authorizeRequests()
          .anyRequest()
          .authenticated()
          .and()
          .httpBasic();
		http.headers().frameOptions().disable();
		http.csrf().disable();
    }


	/*
	 * @Bean public AuthenticationProvider authProvider() {
	 * DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
	 * return provider; }
	 */



}
