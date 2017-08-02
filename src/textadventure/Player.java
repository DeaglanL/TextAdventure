package textadventure;

public class Player {
    private String name;
    private int health;
    private int attack;
    private int posX;
    private int posY;

    public Player(String name, int health, int attack, int posX, int posY)
    {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.posX = posX;
        this.posY = posY;
    }

    public String getName()
    {
        return name;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }

    public void setAttack(int attack)
    {
        this.attack = attack;
    }

}
