package UTPPemlan.Soal1;

public class Player extends Character {
    public Player(String name) {
        super(name);
    }

    public void attack(int damage, Enemy enemy) {
        System.out.println(name + " attacks " + enemy.getName() + " with " + damage + " damage.");
        enemy.health -= damage;
    }

    public void heal(int medic) {
        System.out.println(name + " heals with " + medic + " health points.");
        if (this.health + medic > 100) {
            this.health = 100;
        } else {
            this.health += medic;
        }
        System.out.println(name + "'s health is now " + this.health);
    }
}
