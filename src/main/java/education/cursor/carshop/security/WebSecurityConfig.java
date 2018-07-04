//package education.cursor.carshop.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    private DataSource dataSource;
//
//    @Autowired
//    WebSecurityConfig (DataSource dataSource) {
//        this.dataSource = dataSource;
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                    .antMatchers("/","/cars")
//                    .permitAll()
//                    .anyRequest().authenticated()
//                .and()
//                    .formLogin()
//                    //.loginPage("/login")
//                    .permitAll()
//                .and()
//                    .logout()
//                    .permitAll();
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.jdbcAuthentication()
//                .dataSource(dataSource)
//                .passwordEncoder(NoOpPasswordEncoder.getInstance())
//                .usersByUsernameQuery("SELECT login, password FROM users WHERE login=?")
//                .authoritiesByUsernameQuery("SELECT u.login, ur.roles FROM users u INNTER JOIN user_role ur ON u.id = ur.user_id WHERE u.login=?");
//    }
//}

















    //
//    @Bean
//    @Override
//    public UserDetailsService userDetailsService() {
//        UserDetails user =
//                User.withDefaultPasswordEncoder()
//                        .username("user")
//                        .password("password")
//                        .roles("USER")
//                        .build();
//
//        return new InMemoryUserDetailsManager(user);
//    }
