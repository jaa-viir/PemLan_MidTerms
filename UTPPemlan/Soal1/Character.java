package UTPPemlan.Soal1;
import java.util.*;

public class Character {
    protected int health = 100;
    protected String name;
    
    public int getHealth() {
        return health;
    }
    public String getName() {
        return name;
    }

    public Character(String name) {
        this.name = name;
    }
}