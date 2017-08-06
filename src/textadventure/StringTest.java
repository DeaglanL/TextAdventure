package textadventure;

public class StringTest {
    private String input;
    private char lastGivenMovment;


    public char getLastGivenMovment() {
        return lastGivenMovment;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public void clean()
    {
        input.toLowerCase();
        input.trim();
    }

    public boolean isLook()
    {
        clean();
        return input.contains("look");
    }

    public boolean isMovement()
    {
        clean();

        if (input.contains("north"))
        {
            lastGivenMovment = 'n';
            return true;
        }
        if (input.contains("east"))
        {
            lastGivenMovment = 'e';
            return true;
        }
        if (input.contains("south"))
        {
            lastGivenMovment = 's';
            return true;
        }
        if (input.contains("west"))
        {
            lastGivenMovment = 'w';
            return true;
        }

        return false;
    }


    public boolean isWatch() {
        clean();

        if (input.contains("watch"))
        {
            return true;
        }

        return input.contains("compass");

    }

    public boolean isMap() {
        clean();

        return input.contains("map");
    }

}
