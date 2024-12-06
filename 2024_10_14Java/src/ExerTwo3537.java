public class ExerTwo3537 {
    public static void main(String[] args) {
        int a;
        for (a = 65; a <= 90; a++) {
            if (a%5==0) System.out.println("\n");
            char c = (char) a;
            System.out.printf("%d\t%c\t", a, c);
        }
    }
}
