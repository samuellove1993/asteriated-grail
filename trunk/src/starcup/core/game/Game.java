/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starcup.core.game;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Game {

    private List<Player> players = new ArrayList();
    private static Game game;

    private Game() {
        Player play1 = new Player();
        players.add(play1);
    }

    public static Game getInstance() {
        if (game == null) {
            game = new Game();
        }
        return game;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
