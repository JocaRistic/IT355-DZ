package org.example;

import org.example.classes.JednakostranicniTrougao;
import org.example.classes.Krug;
import org.example.classes.Kvadrat;
import org.example.interceptors.Interceptor;
import org.example.services.OblikService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(proxyTargetClass = true)
@Configuration
public class AppConfiguration {

    @Bean
    public OblikService oblikService(){
        return new OblikService();
    }

    @Bean
    public Interceptor interceptor(){
        return new Interceptor();
    }

    @Bean
    public Kvadrat kvadrat() {
        return new Kvadrat(3);
    }

    @Bean
    public Krug krug() {
        return new Krug(4);
    }

    @Bean
    public JednakostranicniTrougao trougao() {
        return new JednakostranicniTrougao(5);
    }

}