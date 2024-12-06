public class ExerOne3537 {
    public static void main(String[] args) {
        long sum = 0;
        for (int a = 1; a <= 10; a++) {
            long b = 1;
            for (int c = 1; c <= a; c++) {
                b *= c;
            }
            sum += b;
        }
        System.out.println(sum);
    }
}
