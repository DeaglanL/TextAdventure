package textadventure;

public class Runner {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        boolean debug = true;
        if(debug) { //shows a example map gen to check spawns
            Map debugMap = new Map();
            debugMap.populateMap();
            System.out.println(debugMap.getMapLength());
            System.out.print(debugMap);
            debugMap.printMapCord();
            System.out.println(debugMap.getTreasureLocation());
        }


        GameController gc = new GameController();
        gc.game();
    }

}
