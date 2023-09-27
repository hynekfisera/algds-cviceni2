public class Main2 {
    public static void main(String[] args) {
        int c1 = 10;
        int c2 = 10;

        //boolean vysledek = isVetsi(c1, c2);

        //System.out.println(vysledek);

        System.out.println(isVetsiNeboRovno(c1, c2) ? "Je větší nebo rovno" : "Je menší");
    }

    public static boolean isVetsiNeboRovno(int a, int b) {
        return a >= b;
    }

    public static boolean isVetsi(int a, int b) {
        /*if (a > b) {
            return true;
        } else {
            return false;
        }*/

        /*boolean c = a > b;
        return c;*/

        return a > b;
    }
}
