package com.TCS.tcsusecase.configuration;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.session.RedisSessionProperties.ConfigureAction;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.web.servlet.function.ServerRequest.Headers;

//import com.TCS.tcsusecase.filter.Jwtfilter;
import com.TCS.tcsusecase.service.Userservice;
//import com.TCS.tcsusecase.util.Jwtutil;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
@Autowired	
private Userservice userdetailsservice;

//@Autowired
//private Jwtfilter jwtfilter;
protected void configure(AuthenticationManagerBuilder authentication) throws Exception {
	authentication.userDetailsService(userdetailsservice);
}
@Bean
public PasswordEncoder passwordencoder() {
	return NoOpPasswordEncoder.getInstance();
}
@Bean(name = BeanIds.AUTHENTICATION_MANAGER)
@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
		// TODO Auto-generated method stub
		return super.authenticationManagerBean();
	}
@Override
	protected void configure(HttpSecurity http) throws Exception {
	
		http.csrf().disable().authorizeRequests()
		.anyRequest().permitAll()
		.and().exceptionHandling().
		and().
		sessionManagement().
		sessionCreationPolicy(SessionCreationPolicy.ALWAYS);
//http.httpBasic();
		}

@Bean
public SessionRegistry sessionRegistry() {
    return new SessionRegistryImpl();

}
//antMatchers("/authenticate","/accinfo","/transactions","/rewards/**")
//antMatchers("/bank/user/authentication","/bank/user/accinfo","/bank/user/transactions","/bank/user/rewards/**")
//.permitAll()



























}
