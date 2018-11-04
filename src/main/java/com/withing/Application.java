package com.withing;

import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"withing.com"})
public class Application {
    public static void main(String args[]) {
        Configuration configuration = new Configuration().configure();
    }

}
