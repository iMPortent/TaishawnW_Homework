public class Map {
    private static int levels,length,steps;
    private static String map ="";
    static MapSymbols symbols = new MapSymbols();
    Player player;
    Enemy enemy;
    public Map(){
        length = 10;
        levels = 3;
        steps = 2;
        buildMap();
    }

    public Map(int length,int levels,int steps){
        this.length=length;
        this.levels=levels;
        this.steps=steps;
        buildMap();
    }

    public static String buildMap(){
        symbols.createMap(levels,length,steps);
        //System.out.println(getMap());
        setMap(symbols.getDumMap());
        return map;
    }
    public static String getMap(){
        return map;
    }
    public static void setMap(String string){
        map += string;
    }

}
