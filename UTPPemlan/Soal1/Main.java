package UTPPemlan.Soal1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player("Player");
        Enemy enemy = new Enemy("Enemy");
        String turn = "Player";

        while (player.getHealth()>0 && enemy.getHealth()>0) {
            if (turn == "Player") {
                System.out.println(player.getName() + "'s turn:");
                int action = scanner.nextInt();
                int value = scanner.nextInt();
                if (action == 1) {
                    player.attack(value, enemy);
                } else if (action == 2) {
                    player.heal(value);
                }
                turn = "Enemy";
            } else {
                System.out.println(enemy.getName() + "'s turn:");
                int action = (int) (Math.random() * 2) + 1;
                int value = (int) (Math.random() * 100) + 1;
                if (action == 1) {
                    enemy.attack(value, player);
                } else if (action == 2) {
                enemy.heal(value);
                    }
                turn = "Player";
            }
        }
    }
}