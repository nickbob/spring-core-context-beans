package ru.nickbob;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ru.nickbob.beans.Context;
import ru.nickbob.config.SpringConfig;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        Context context = ctx.getBean("context", Context.class);

        System.out.println(context.toString());

        context.destroyContext();

        ctx.close();
    }
}