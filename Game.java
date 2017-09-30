public class Game {
    private  Map gameMap = new Map();
    private static Player player = new Player();
     private static Enemy CPU = new Enemy();

    public Game() {
        initGame();
        //Motion.addPlayer(CPU,gameMap.getMap());
    }

    public  void initGame() {
        Motion.addPlayer(player, gameMap.getMap());
        //System.out.println(gameMap.getMap());
        while(player.getHealth() >=0) {
            Motion.move(gameMap.getMap(), player);
        }
    }

}
