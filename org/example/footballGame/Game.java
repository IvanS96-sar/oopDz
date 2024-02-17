package org.example.footballGame;

public class Game {
    public static void main(String[] args) {
        Player player1 = new Player(98);
        Player player2 = new Player(93);
        Player player3 = new Player(91);
        Player player4 = new Player(92);
        Player player5 = new Player(97);
        Player player6 = new Player(99);

        Player.info();

        Player player7 = new Player(99);

        Player.info();
        for (int i = 0; i < 93; i++) {
        player2.run();
        }
    }
}
