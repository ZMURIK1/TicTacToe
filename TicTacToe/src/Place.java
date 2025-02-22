public class Place {

    public String[] createMap(){
        // Заполняем массив полем
        String[] map = new String[9];
        for(int i = 0; i < map.length; i++){
            map[i] = String.valueOf(i+1);
        }
        return map;
    }

    public void renderMap(String[] map){
        // Отрисовываем поле
        int counter = 0;
        for(int i = 0; i < map.length; i++){
            System.out.print(map[i] + "|");
            counter++;
            if(counter % 3 == 0){
                System.out.println();
            }
        }
    }

    public String[] refactorMap(String map[], String player, int move){
        String[] funcMap = map;

        funcMap[move - 1] = player;

        return funcMap;
    }
}
