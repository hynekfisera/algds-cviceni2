public class Main3 {
    public static void main(String[] args) {
        String text = "J22";
        System.out.println(obsahujeCislo(text));
    }

    public static boolean obsahujeCislo(String t) {
        if (t.contains("1") || t.contains("2") || t.contains("3") || t.contains("4") || t.contains("5") || t.contains("6") || t.contains("7") || t.contains("8") || t.contains("9") || t.contains("0")) {
            return true;
        } else {
            return false;
        }
    }
}
