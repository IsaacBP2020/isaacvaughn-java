public class ThreeBoxes {
    public static final int ROW= 3;
    public static final int COLLUM= 5;
    public static void main(String[] args) {
        for (int I = 0; I < ROW; I++) {
            for (int A = 0; A < COLLUM ;
            A++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int I = 0; I < ROW; I++) {
            for (int A = 0; A < COLLUM ;
                 A++){
                System.out.print("$");
            }
            System.out.println();
        }
        for (int I = 0; I < ROW; I++) {
            for (int A = 0; A < COLLUM ;
                 A++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
