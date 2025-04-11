package com.expense.splitter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Disable CSRF for simplicity (enable in production)
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/auth/register", "/auth/login").permitAll() // Public endpoints
                        .requestMatchers("/admin/**").hasRole("ADMIN")
                        .anyRequest().authenticated() // All other endpoints require authentication
                )
                .formLogin(form -> form
                        .loginProcessingUrl("/auth/login") // Custom login endpoint
                        .defaultSuccessUrl("/home", true) // Redirect after successful login
                        .failureUrl("/auth/login?error=true") // Redirect after failed login
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutUrl("/auth/logout") // Custom logout endpoint
                        .logoutSuccessUrl("/auth/login?logout=true") // Redirect after logout
                        .permitAll()
                )
                .sessionManagement(session -> session
                        .sessionFixation().migrateSession() // Prevent session fixation attacks
                        .maximumSessions(1) // Allow only one session per user
                        .maxSessionsPreventsLogin(false) // Allow new login and invalidate old session
                );

        return http.build();
    }
}