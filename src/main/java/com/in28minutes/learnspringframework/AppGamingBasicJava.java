package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.GameRunner;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var superContraGame = new SuperContraGame();
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
