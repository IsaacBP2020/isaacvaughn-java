import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Rolldice {
    public static void main(String [] args){
        defDice();
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

    public static void defDice(){
        System.out.println("defDice");
       String[][]dice = new String[6][6];
       dice[1][1]= -;
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

