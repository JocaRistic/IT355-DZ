package org.example.main;

import org.example.AppConfiguration;
import org.example.classes.JednakostranicniTrougao;
import org.example.classes.Krug;
import org.example.classes.Kvadrat;
import org.example.interfaces.Oblik;
import org.example.services.OblikService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        Oblik kvadrat = context.getBean(Kvadrat.class);
        Oblik krug = context.getBean(Krug.class);
        Oblik jedTrougao = context.getBean(JednakostranicniTrougao.class);

        OblikService oblikService = (OblikService) context.getBean("oblikService");

        oblikService.oblikInfo(kvadrat);
        oblikService.oblikInfo(krug);
        oblikService.oblikInfo(jedTrougao);

    }
}