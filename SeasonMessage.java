import java.util.Scanner;

public class SeasonMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter (1 = Spring), (2 = summer), (3 = rainy), (4 = winter)");
        int season = scan.nextInt();
        if (season == 1) {
            springSeason();
        }
        if (season == 2) {
            summerSeason();
        }
        if (season == 3) {
            rainySeason();
        }
        if (season == 4) {
            winterSeason();
        }
    }

    public static void springSeason() {
        System.out.println("This is Spring Season!, and flowers are blossom!");
    }

    public static void summerSeason() {
        System.out.println("This is Summer Season!, this is very hot season!");
    }

    public static void rainySeason() {
        System.out.println("This is Rainy Season!, this is wet season!");
    }

    public static void winterSeason() {
        System.out.println("This is Spring Season!, it is snowing!");
    }
}
