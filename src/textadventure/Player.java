package textadventure;

public class Player {
    String name;
    int health;
    int attack;
    int movement;
    int posX;
    int posY;

    public Player(String name, int health, int attack, int movement, int posX, int posY)
    {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.movement = movement;
        this.posX = posX;
        this.posY = posY;
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
