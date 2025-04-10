/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.example;

import org.example.config.AppConfig;
import org.example.patterns.Pattern;
import org.example.patterns.Rectangle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {

    public static void main(String[] args) {
        String beanName = args[0];
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Pattern generator = (Pattern) context.getBean(beanName);
        List<String> pattern = generator.generatePattern();
        String join = String.join("\n", pattern);
        System.out.println(join);
    }
}
