package com.example.learntheword.config;


import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.sql.DataSource;

@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final DataSource dataSource;

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.jdbcAuthentication()
//                .dataSource(dataSource)
//                .usersByUsernameQuery(
//                        "select email, password,enabled from account " +
//                                "where email=?")
//                .authoritiesByUsernameQuery(
//                        "select email, authority from account " +
//                                "where email=?");
//    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
////                .and()
////                .formLogin()
////                .usernameParameter("name")
////                .loginPage("/login")
////                .permitAll()
////                .defaultSuccessUrl("/main", true)
////                .and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//                .and()
//                .httpBasic()
//                .and().csrf().disable();
//    }
}