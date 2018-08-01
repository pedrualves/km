package com.kwm.config

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@Configuration
open class SecurityConfig : WebSecurityConfigurerAdapter {

    constructor() {}

    constructor(disableDefaults: Boolean = true) : super(disableDefaults)

    override fun configure(http: HttpSecurity) {
        http.authorizeRequests()
            .antMatchers("/", "/api/health").permitAll()
            .anyRequest().authenticated()
            .and()
            .formLogin().permitAll()
            .and()
            .logout().permitAll()
    }

}
