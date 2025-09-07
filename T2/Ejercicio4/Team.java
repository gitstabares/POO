package T2.Ejercicio4;

import java.util.List;
import java.util.ArrayList;

public class Team {
    private String name;
    private List<Player> players = new ArrayList<Player>();
    Team(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public List<Player> getPlayers() {
        return players;
    }
    public void addPlayer(Player player) {
        players.add(player);
    }
    public void removePlayer(Player player) {
        players.remove(player);
    }
}
