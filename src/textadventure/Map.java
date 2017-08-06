package textadventure;
import java.util.Random;

public class Map {
    Random mRand = new Random();
    private char[][] map = new char[10][10];
    private String treasureLocation;
    private int monsterCount = 5; //have this set in constructor

    public String getTreasureLocation() {
        return treasureLocation;
    }

    public  void populateMap()
    {

        int monsterX = mRand.nextInt(map.length); //set initial monster spawns
        int monsterY = mRand.nextInt(map.length);
        int tX = mRand.nextInt(map.length);
        int tY =  mRand.nextInt(map.length);
        int mX = mRand.nextInt(map.length);
        int mY = mRand.nextInt(map.length);
        for(int j = map.length - 1; j >= 0; j--)
        {
            for(int i = 0; i < map.length; i++)
            {
                if(i == tX && j == tY) //replace this with random gen and add another for monster spawns
                {
                    map[i][j] = 't';
                    treasureLocation =  convertToCord(i,j);
                } else if (i == mX && j == mY) //replace this with random gen and add another for monster spawns
                {
                    map[i][j] = 'c';

                } else if ((i == monsterX && j == monsterY && monsterCount > 0) ) {
                    map[i][j] = 'm';

                    //gen next spawn
                    monsterX = mRand.nextInt((map.length - i) + i);
                    monsterY = mRand.nextInt((map.length - j) + j);
                    monsterCount--;
                } else {
                    map[i][j] = 'x';
                }

            }
        }
    }

    public  void printMap()
    {
        for(int j = map.length - 1; j >= 0; j--)
        {
            for(int i = 0; i < map.length; i++)
            {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }


    public  void printMapCord()
    {
        for(int j = map.length - 1; j >= 0; j--)
        {
            for(int i = 0; i < map.length; i++)
            {
                if (i<=10)
                {
                    System.out.print(Integer.toString(i) + Integer.toString(j) + " ");
                }
                else if(i>=10)
                {
                    System.out.print(Integer.toString(i) + Integer.toString(j));
                }
            }
            System.out.println();
        }
    }

    public String convertToCord(int x, int y)
    {

        String cord = Integer.toString(x) + Integer.toString(y);
        return cord;
    }



    public char checkPos(int x, int y)
    {
        return map[x][y];
    }

    public void setPosState(char state, int x, int y) {
        map[x][y] = state;
    }

    public int getMapLength(){return map.length;}

    @Override
    public String toString() {
        String mapPrint = "";

        for(int j = map.length - 1; j >= 0; j--)
        {
            for(int i = 0; i < map.length; i++)
            {
                mapPrint += (map[i][j] + " ");
            }
            mapPrint += "\n";
        }

        return mapPrint;
    }
}
