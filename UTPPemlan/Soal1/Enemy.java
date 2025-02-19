package UTPPemlan.Soal1;

public class Enemy extends Character{
    public Enemy(String name) {
        super(name);
    }

    public void attack(int damage, Player player) {
        System.out.println(name + " attacks " + player.getName() + " with " + damage + " damage.");
        player.health -= damage;
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

