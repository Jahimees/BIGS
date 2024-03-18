package by.jahimees.bigs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@SpringBootApplication
@EnableWebSecurity
@EnableMethodSecurity
public class BigsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BigsApplication.class, args);
    }

    //Заглушка для настроек Spring Security. Разрешает доступ всем и ко всему
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(auth -> {
                            auth.requestMatchers(AntPathRequestMatcher.antMatcher("/**")).permitAll();
                        }
                )
                .httpBasic(Customizer.withDefaults())
                .formLogin(form -> {
                    form
                            .loginPage("/login")
                            .defaultSuccessUrl("/main")
                            .usernameParameter("username")
                            .passwordParameter("password")
                            .permitAll();
                })
                .logout(logout -> {
                    logout
                            .logoutSuccessUrl("/main")
                            .permitAll();
                })
                .csrf(csrf -> csrf.disable())
                .build();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
