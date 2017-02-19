/*
package com.norfan.websocket;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

@Component
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter
{
    @Override
    protected void configure(HttpSecurity http)
    {
        try
        {
            http.authorizeRequests().antMatchers("/", "/login", "/chat").permitAll().anyRequest().authenticated().and().formLogin().loginPage("/login").defaultSuccessUrl("/chat").permitAll().and().logout()
                    .permitAll();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    protected void configure(AuthenticationManagerBuilder amb) throws Exception
    {
        amb.inMemoryAuthentication().withUser("sietmj").password("sietmj").roles("USER").and().withUser("admini").password("admini").roles("USER");
    }

    @Override
    public void configure(WebSecurity ws)
    {
        ws.ignoring().antMatchers("/images/**","/js/**");
    }
}
*/