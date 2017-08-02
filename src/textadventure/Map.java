package textadventure;

public class Map {
    char[][] map = new char[5][5];

    public  void populateMap()
    {
        for (int i =0; i < map.length; i++)
        {
            for(int j = 0; j < map.length; j++)
            {
                map[i][j] = 'x';
            }
        }
    }

    public  void printMap()
    {
        for (int i =0; i < map.length; i++)
        {
            for(int j = 0; j < map.length; j++)
            {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }


    public  void printMapCord()
    {
        for (int i =0; i < map.length; i++)
        {
            for(int j = 0; j < map.length; j++)
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

}
