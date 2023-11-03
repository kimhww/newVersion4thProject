package com.thProject.myChef.config;

import com.thProject.myChef.component.CustomAuthenticationFailureHandler;
import com.thProject.myChef.component.CustomAuthenticationSuccessHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Slf4j
@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final CustomAuthenticationSuccessHandler customAuthenticationSuccessHandler;
    private final CustomAuthenticationFailureHandler customAuthenticationFailureHandler;

    @Override
    public void configure(WebSecurity web) throws Exception {
        //static 하위 파일은 인증 대상에서 제외
        web.ignoring().antMatchers("/css/**");
        web.ignoring().antMatchers("/favicon.ico");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        log.info("======================================");
        log.info(">> Run on Spring security");
        log.info("======================================");

        http.authorizeRequests()
                .antMatchers("/login").permitAll()
                .antMatchers("/join").permitAll()
                .antMatchers("/user/join").permitAll()
                .anyRequest().authenticated();

        //로그인 설정
        http.formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/authenticate")
                .successHandler(customAuthenticationSuccessHandler)
                .failureHandler(customAuthenticationFailureHandler)
                .permitAll();

        http.logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/login")
                .invalidateHttpSession(true);

        http.exceptionHandling()
                .accessDeniedPage("/denied");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

}