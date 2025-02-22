import java.util.Scanner;

public class Main {
    private static int[][] winPlace = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {1, 4, 7},
            {2, 5, 8},
            {3, 6, 9},
            {1, 5, 9},
            {3, 5, 7}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        game(scanner);
    }

    public static void game(Scanner scanner){
        boolean isTrue = true;
        String winner = "";

        // Создаем поле (объект класса)
        Place place = new Place();
        String[] map = place.createMap();

        while(true){
            for(int i = 0; i < winPlace.length; i++){
                if(map[winPlace[i][0] - 1] == map[winPlace[i][1] - 1] && map[winPlace[i][1] - 1]== map[winPlace[i][2] - 1]){
                    winner = map[winPlace[i][0] -1];
                    isTrue = false;
                    break;
                }
            }
            if(isTrue != true){
                System.out.println("Выиграли: " + winner);
                break;
            } else {

                place.renderMap(map); // Выводим карту
                System.out.print("Ход X: ");
                int moveX = Integer.parseInt(scanner.nextLine());
                map = place.refactorMap(map, "X", moveX);

                place.renderMap(map);
                System.out.print("Ход 0: ");
                int moveO = Integer.parseInt(scanner.nextLine());
                map = place.refactorMap(map, "0", moveO);

            }
        }
    }
}