package org.example.footballGame;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player (int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        } else {
            System.out.println("Игроков уже 6");
        }
    }

    public int getStamina() {
        return stamina;
    }
    public void run() {
        stamina--;
        if (stamina == MIN_STAMINA) {
            countPlayers--;
            System.out.println("Игрок выбыл");
        }
        if (stamina < MIN_STAMINA) {
            System.out.println("Игроку нужен отдых");
        }
    }
    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды не полные. На поле еще есть "
                    + (6 - countPlayers) + " свободных мест");
            countPlayers++;
        } else {
            System.out.println("Свободных мест нет");
        }
    }
}
