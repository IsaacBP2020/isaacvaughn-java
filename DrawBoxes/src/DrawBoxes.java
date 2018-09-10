public class DrawBoxes {

    public static void main(String[] args) {
        System.out.println("Draw Boxes");
        drawBox();
        drawBox();
        drawBox();
        System.out.println("Complete");
    }
    public static void drawBox() {
            drawtop();
            drawside();
            drawside();
            drawtop();

        }

    public static void drawtop() {
        System.out.println("+------+");
    }
    public static void drawside(){
        System.out.println("|      |");
    }


}

