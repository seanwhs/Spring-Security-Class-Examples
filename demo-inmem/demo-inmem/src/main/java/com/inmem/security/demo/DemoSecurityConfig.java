package com.inmem.security.demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class DemoSecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {

        UserDetails ravi = User.builder()
                .username("ravi")
                .password("{noop}welcome123")
                .roles("EMPLOYEE")
                .build();

        UserDetails freddie = User.builder()
                .username("freddie")
                .password("{noop}welcome123")
                .roles("EMPLOYEE", "MANAGER")
                .build();

        UserDetails lizzy = User.builder()
                .username("lizzy")
                .password("{noop}welcome123")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(ravi, freddie, lizzy);
    }
}
