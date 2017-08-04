package textadventure;

public class Map {
    private char[][] map = new char[10][10];
    private String treasureLocation;

    public String getTreasureLocation() {
        return treasureLocation;
    }

    public  void populateMap()
    {
        for(int j = map.length - 1; j >= 0; j--)
        {
            for(int i = 0; i < map.length; i++)
            {
                if(i == 5 && j == 5) //replace this with random gen and add another for monster spawns
                {
                    map[i][j] = 't';
                    treasureLocation =  convertToCord(i,j);
                }
                else
                {
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
