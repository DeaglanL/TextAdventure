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

    public int getAttack() {
        return attack;
    }

    public int getHealth() {
        return health;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
}
