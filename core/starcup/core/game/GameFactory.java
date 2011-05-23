/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starcup.core.game;

import starcup.core.game.card.IGame;

/**
 * 大部分基本的游戏主键工厂类
 * @author Akira.Pan
 */
public class GameFactory {

    private static GameFactory factory;

    /**
     * 获取当前实例
     * @return 
     */
    public static GameFactory getInstance() {
        if (null == factory) {
            factory = new GameFactory();
        }
        return factory;
    }

    /**
     * 获取一个游戏类
     * @return 
     */
    public IGame getNewGame() {
        return Game.getInstance();
    }
}
