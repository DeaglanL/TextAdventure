package textadventure;

public class Player {
    String name;
    int health;
    int attack;
    int movement;


    public Player(String name, int health, int attack, int movement)
    {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.movement = movement;
    }

    public void getName(String name)
    {
        this.name = name;
    }

    public void getHealth(int health)
    {
        this.health = health;
    }

    public void getAttack(int attack)
    {
        this.attack = attack;
    }

    public void getMovement(int movement)
    {
        this.movement = movement;
    }
}
