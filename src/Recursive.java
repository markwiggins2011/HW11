/**
 * Created by mark.wiggins on 10/30/2017.
 */

@SuppressWarnings("MagicConstant")
public class Recursive {
    public Recursive() {
    }

    public static void printEveryOther(int[] ia, int k) {
        if(k < ia.length) {
            printEveryOther(ia, k + 2);
            if(k >= 0) {
                System.out.print(ia[k]);
            }
        }

    }

    public static void printStars(String s) {
        if(s.length() > 1) {
            System.out.print(s.charAt(0));
            if(s.charAt(0) == s.charAt(1)) {
                System.out.print("*");
            }

            printStars(s.substring(1));
        } else {
            System.out.print(s);
        }

    }

    public static void main(String[] args) {
        printEveryOther(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 2);
        System.out.println();
        printStars("hello");
    }
}
