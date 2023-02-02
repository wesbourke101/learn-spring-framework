package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PackManGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GamingSpringBeans {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext
                (gamingConfiguration.class);) {
            context.getBean(PackManGame.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
