package textadventure;

import java.util.Scanner;

public class GameController {
    private Scanner sc = new Scanner(System.in);
    private Map map = new Map();
    private Player pc;
    private boolean gameFinished;
    private String playerInput;
    private StringTest sT = new StringTest();
    private char playerEvent;

    public void game()
    {
        //playerSet up
        System.out.println("Please enter your name");
        pc = new Player(sc.nextLine(),20,5,4,4);
        System.out.println();
        System.out.println("Welcome " + pc.getName());


        //Game intro
        System.out.println("You awaken to find yourself in a barren moor. You have no idea how you got here but you feel compelled to search the moor");
        System.out.println("Try looking around and see what you see");

        //Gameloop
        while (!gameFinished)
        {
            System.out.println("What would you like to do?");

            //take input from player
            sT.setInput(sc.nextLine());

            //if input is look describe area
            if (sT.isLook())
            {
                System.out.println("Grey foggy clouds float oppressively close to you,");
                System.out.println("reflected in the murky grey water which reaches up your shins.");
                System.out.println("Some black plants barely poke out of the shallow water.");
                System.out.println("Try \"north\",\"south\",\"east\",or \"west\"");
                System.out.println("You notice a small watch-like device in your left hand. ");
                System.out.println("It has hands like a watch, but the hands don't seem to tell time.");
            }

            //if move , move and check player location
            if (sT.isMovement())
            {
                switch (sT.getLastGivenMovment())
                {
                    case 'n':
                        if ((pc.getPosY()+1)>(map.getMapLength()-1))
                        {
                            System.out.println("You cant go that way");
                            break;
                        }
                        System.out.println("You move north");
                        pc.setPosY(pc.getPosY() + 1 );
                        break;
                    case 'e':
                        if ((pc.getPosX()+1)>(map.getMapLength()-1))
                        {
                            System.out.println("You cant go that way");
                            break;
                        }
                        System.out.println("You move east");
                        pc.setPosX(pc.getPosX() + 1 );
                        break;
                    case 's':
                        if ((pc.getPosY()-1)>(map.getMapLength()-1))
                        {
                            System.out.println("You cant go that way");
                            break;
                        }
                        System.out.println("You move south");
                        pc.setPosY(pc.getPosY() - 1 );
                        break;
                    case 'w':
                        if ((pc.getPosX()-1)>(map.getMapLength()-1))
                        {
                            System.out.println("You cant go that way");
                            break;
                        }
                        System.out.println("You move north");
                        pc.setPosX(pc.getPosX() - 1 );
                        break;
                }

                //and check player location
               playerEvent = map.checkPos(pc.getPosX(), pc.getPosY());

                if (playerEvent != 'x')
                {
                    //do a switch to check the even then do call event method
                    switch (playerEvent) {
                        case 't':
                            //find the treasure game ends
                            break;

                        case 'm':
                            //find a monster combat or attempt sneak
                            break;

                        case 'i':
                            //find a item, stats increased
                            break;

                        case 'c': //c for cartography because i used m already
                            //find a map, gain ability to look at map
                                break;
                        default:
                            break;
                    }
                }

            }




        }

    }
}
