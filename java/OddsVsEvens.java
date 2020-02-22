/**
 * Odds vs. Evens
 * @author piibear writecode
 */
public class OddsVsEvens {

    public static void GuessOddsVsEvens(int[] list) {
        int odds = 0;
        int evens = 0;

        for (int number : list) {
            if (number % 2 == 0) {
                evens += number;
            } else {
                odds += number;
            }
        }

        if (odds > evens) {
            System.out.println("odd");
        } else if (evens > odds) {
            System.out.println("even");
        } else {
            System.out.println("equal");
        }
    }

    public static void main(String[] args) {
        int list_1[] = { 9, 7, 4, 2, 8 };
        int list_2[] = { 8, 1, 9, 6, 1 };
        int list_3[] = { 5, 4, 8, 7, 0 };

        GuessOddsVsEvens(list_1);
        GuessOddsVsEvens(list_2);
        GuessOddsVsEvens(list_3);
    }
}