package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PackManGame;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class gamingConfiguration {

    @Bean
    public PackManGame game() {
        var game = new PackManGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(PackManGame game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

}
