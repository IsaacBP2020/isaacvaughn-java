public class Rocket {
    public static void main(String[] args) {
        cone();
        top();
        bot();
    }

    public static void cone() {
        for (int a = 1; a <= 5; a++) {
            System.out.println();
            for (int d = 5; d >= a; d--) {
                System.out.print(" ");
            }
            for (int b = 1; b <= a; b++) {
                System.out.print("/");
            }
            for (int c = 1; c < 2; c++) {
                System.out.print("**");
            }
            for (int b = 1; b <= a; b++) {
                System.out.print("\\");
            }
        }
    }
   public static void top() {
        for (int a = 1; a <= 3; a++) {
            System.out.println();
            System.out.print(" ");
            for (int b=2; b>=a;b--) {
                System.out.print(".");
            }
            for (int c=1; c<=a;c++){
                System.out.print("/\\");
            }
            for (int b=2; b>=a;b--) {
                System.out.print("..");
            }
            for (int c=1; c<=a;c++){
                System.out.print("/\\");
            }
            for (int b=2; b>=a;b--) {
                System.out.print(".");
            }

        }
    }
    public static void bot(){
        for (int a = 1; a<=3; a++){
            System.out.println();
            System.out.print("");
            for (int b=2; b<=a; b++){
                System.out.print(".");
            }
            for (int c=3; c>=a; c--){
                System.out.print("\\/");
            }
            for (int d=2; d<=a; d++){
                System.out.print("..");
            }
            for (int c=3; c>=a; c--){
                System.out.print("\\/");
            }
            for (int b=2; b<=a; b++){
                System.out.print(".");
            }
        }
    }
}