import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Rolldice {
    public static void main(String [] args){
       String dices[][]= defDice();
        for(int i=0; i<= 4; i++){
            for (int j=0; j <=5; j++){
                System.out.print(dices[i][j]);
            }
            System.out.println();
        }
        Scanner keyboard = new Scanner(System.in);
        System.out.println("do you want to play a game? \"yes\" or \"no\"");
        String play = keyboard.nextLine();
        while (play.equals("yes") ) {
            rollDice();
            printDice();
            drawLine();
            System.out.println("roll again?");
            play = keyboard.nextLine();
    }
        System.out.println("thank you for playing");
}

    public static String[][] defDice(){
        System.out.println("defDice");
        String topBottom= " ------- ";
       String blank=    "|       |";
       String leftOne=  "| *     |";
       String rightOne= "|    *  |";
       String middleOne="|   *   |";
       String middleTwo="| *   * |";
        String[][]dice = new String[5][6];
        dice[0][0]= topBottom;
        dice[1][0]= blank;
        dice[2][0]= middleOne;
        dice[3][0]= blank;
        dice[4][0]= topBottom;

        dice[0][1]= topBottom;
        dice[1][1]= blank;
        dice[2][1]= middleTwo;
        dice[3][1]= blank;
        dice[4][1]= topBottom;

        dice[0][2]= topBottom;
        dice[1][2]= rightOne;
        dice[2][2]= middleOne;
        dice[3][2]= leftOne;
        dice[4][2]= topBottom;

        dice[0][3]= topBottom;
        dice[1][3]= middleTwo;
        dice[2][3]= blank;
        dice[3][3]= middleTwo;
        dice[4][3]= topBottom;

        dice[0][4]= topBottom;
        dice[1][4]= middleTwo;
        dice[2][4]= middleOne;
        dice[3][4]= middleTwo;
        dice[4][4]= topBottom;

        dice[0][5]= topBottom;
        dice[1][5]= middleTwo;
        dice[2][5]= middleTwo;
        dice[3][5]= middleTwo;
        dice[4][5]= topBottom;

        return dice;

    }
    public static void rollDice(){
        System.out.println("rollDice");

    }
    public static void printDice(){
        System.out.println("printDice");
    }
    public static void drawLine(){
        System.out.println("drawLine");
    }
}

