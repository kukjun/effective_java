package chapter2.item6;

public class Sum {
    private static long badSum() {
        long before = System.currentTimeMillis();

        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }

        System.out.println(System.currentTimeMillis() - before);
        return sum;
    }

    private static long goodSum() {
        long before = System.currentTimeMillis();

        long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }

        System.out.println(System.currentTimeMillis() - before);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("bad sum= " + badSum());
        System.out.println("good sum= " + goodSum());
    }
}
