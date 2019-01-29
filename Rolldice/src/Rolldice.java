import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Rolldice {
    public static void main(String[] args) {
        String[][] dices = defDice();
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print(dices[i][j]);
            }
            System.out.println();
        }
        Scanner keyboard = new Scanner(System.in);
        System.out.println("do you want to play a game? \"yes\" or \"no\"");
        String play = keyboard.nextLine();
        while (play.equals("yes")) {
            // rollDice();
            int number = rollDice();
            printDice(number, dices);
            drawLine();
            System.out.println("roll again?");
            play = keyboard.nextLine();
        }
        System.out.println("thank you for playing");
    }

    public static String[][] defDice() {
        System.out.println("defDice");
        String topBottom = " ------- ";
        String blank = "|       |";
        String leftOne = "| *     |";
        String rightOne = "|    *  |";
        String middleOne = "|   *   |";
        String middleTwo = "| *   * |";
        String[][] dice = new String[5][6];
        dice[0][0] = topBottom;
        dice[1][0] = blank;
        dice[2][0] = middleOne;
        dice[3][0] = blank;
        dice[4][0] = topBottom;

        dice[0][1] = topBottom;
        dice[1][1] = blank;
        dice[2][1] = middleTwo;
        dice[3][1] = blank;
        dice[4][1] = topBottom;

        dice[0][2] = topBottom;
        dice[1][2] = rightOne;
        dice[2][2] = middleOne;
        dice[3][2] = leftOne;
        dice[4][2] = topBottom;

        dice[0][3] = topBottom;
        dice[1][3] = middleTwo;
        dice[2][3] = blank;
        dice[3][3] = middleTwo;
        dice[4][3] = topBottom;

        dice[0][4] = topBottom;
        dice[1][4] = middleTwo;
        dice[2][4] = middleOne;
        dice[3][4] = middleTwo;
        dice[4][4] = topBottom;

        dice[0][5] = topBottom;
        dice[1][5] = middleTwo;
        dice[2][5] = middleTwo;
        dice[3][5] = middleTwo;
        dice[4][5] = topBottom;

        return dice;

    }

    public static int rollDice() {
        int random = (int) (Math.random() * 6 + 1);
        System.out.println(random);
        return random;
    }

    public static void printDice(int x, String[][] a) {
        if (x == 1) {
            System.out.println(a[0][0]);
            System.out.println(a[1][0]);
            System.out.println(a[2][0]);
            System.out.println(a[3][0]);
            System.out.println(a[4][0]);
        } else if (x == 2) {
            System.out.println(a[0][1]);
            System.out.println(a[1][1]);
            System.out.println(a[2][1]);
            System.out.println(a[3][1]);
            System.out.println(a[4][1]);
        } else if (x == 3) {
            System.out.println(a[0][2]);
            System.out.println(a[1][2]);
            System.out.println(a[2][2]);
            System.out.println(a[3][2]);
            System.out.println(a[4][2]);
        } else if ((x == 4)) {
            System.out.println(a[0][3]);
            System.out.println(a[1][3]);
            System.out.println(a[2][3]);
            System.out.println(a[3][3]);
            System.out.println(a[4][3]);
        } else if (x == 5) {
            System.out.println(a[0][4]);
            System.out.println(a[1][4]);
            System.out.println(a[2][4]);
            System.out.println(a[3][4]);
            System.out.println(a[4][4]);
        } else if (x == 6) {
            System.out.println(a[0][5]);
            System.out.println(a[1][5]);
            System.out.println(a[2][5]);
            System.out.println(a[3][5]);
            System.out.println(a[4][5]);
        } else {
            System.out.println("broken");
        }
    }
        public static void drawLine(){
            System.out.println("----------------------------");
        }
    }


