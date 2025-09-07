package T2.Ejercicio4;

public class TestTeam {
    public static void main(String[] args) {
        Team team= new Team("R7");
        Player player1= new Player("Santiago", "TOP");
        Player player2= new Player("Andres", "ADC");
        team.addPlayer(player1);
        team.addPlayer(player2);
        System.out.println("Equipo: " + team.getName());
        for (Player player : team.getPlayers()) {
            System.out.println("- " + player.getName() + " (" + player.getPosition() + ")");
        }
    }
}
