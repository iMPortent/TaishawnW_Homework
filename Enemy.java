import java.util.Random;

public class Enemy extends Player {
    Random random = new Random();
    private int pos = 313;
    private char sym = '<';
    private int health = 50;

    @Override
    public char getSym() {
        return sym;
    }
    public int getHealth() {
        return health;
    }

    public int getPos() {
        return pos;
    }


}
