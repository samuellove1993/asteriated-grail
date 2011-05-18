/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package starcup.core.game;

import java.util.List;

/**
 *
 * @author Akira.Pan
 */
public class Team {

    static int RED_TEAM = 0;
    static int BLUE_TEM = 1;
    private int type;
    /*队伍中的玩家*/
    private List<Player> players;

    public Team(int type) {
        if (type == RED_TEAM || type == BLUE_TEM) {
            this.type = type;
        }
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
