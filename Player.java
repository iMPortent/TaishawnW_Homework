public class Player {
    final private String userName = "";

    private int pos = 1;
    private int health = 100;
    private char sym = 'X';

    public int getHealth() {
        return health;
    }

    public int getPos() {
        return pos;
    }

    public char getSym() {
        return sym;
    }
    public void setSym(char sym){
        this.sym = sym;
    }

    public void drainHealth(){
        health -=10;
    }

    public void changePos(char operator, int num) {
        switch (operator) {
            case '+':
                pos += num;
                break;
            case '-':
                pos -= num;
                break;
            default:
                System.out.println("error");
        }
    }


}
