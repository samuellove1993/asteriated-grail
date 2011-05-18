/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starcup.core.game;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author Administrator
 */
public class Game {

    private List<Player> players = new ArrayList();
    private List<Team> teams = new ArrayList();
    private static Game game;
    private static org.apache.commons.logging.Log logger = LogFactory.getLog(Game.class);

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
