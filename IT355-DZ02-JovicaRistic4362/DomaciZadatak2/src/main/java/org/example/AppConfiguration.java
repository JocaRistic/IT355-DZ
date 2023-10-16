package org.example;

import org.example.classes.JednakostranicniTrougao;
import org.example.classes.Krug;
import org.example.classes.Kvadrat;
import org.example.services.OblikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Autowired
    private OblikService oblikService;

    @Bean
    public OblikService oblikService(){
        return new OblikService();
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