package textadventure;

import java.util.Scanner;

public class GameController {
    private Scanner sc = new Scanner(System.in);
    private Map map = new Map();
    private Player pc;

    public void game()
    {
        //playerSet up
        System.out.println("Please enter your name");
        pc = new Player(sc.nextLine(),20,5,4,4);
        System.out.println();
        System.out.println("Welcome " + pc.getName());


        //Game intro
        System.out.println("You awaken to find yourself in a barren moor. You have no idea how you got here but you feel compelled to search the moor");

        //Gameloop
    }
}
