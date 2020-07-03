package geekbrains.hw;

public class Main {
    byte a = 1;
    short b = 2;
    int c = 3;
    long d = 4;
    float q = (float) 1.1;
    double w = 3.1;
    boolean r = true;
    boolean t = false;
    char ch = 'E';

    public static void main(String[] args) {

        rerun3(4);
        rerun4(4);
        rerun5("Erzhan");
    }
        static int rerun1 (int x, int y, int z, int v) {
            int j = x+(y*(z/v));
            return j;
        }

        static void rerun2 (int k, int l) {
            if(k <= 20 && k >= 10) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }

        static int rerun3 (int h) {
            if( h >= 0) {
                System.out.println("bolshe ");
            } else {
                System.out.println("menshe ");
            }
            return h;
        }

        static int rerun4 (int g) {
            if(g < 0) {
                System.out.println(g);
            }
            return g;
        }
        static String rerun5 (String name){
            System.out.println("Hello " + name);
            return name;
        }


}