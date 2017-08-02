package textadventure;

public class Map {
    char[][] map = new char[10][10];

    public  void populateMap()
    {
        for(int j = map.length - 1; j >= 0; j--)
        {
            for(int i = 0; i < map.length; i++)
            {
                map[i][j] = 'x';
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

    public  void checkPos(int x, int y)
    {

    }

}
