package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        if (lastFibonacci <= 0) {
            System.out.println(0);
        } else if (lastFibonacci == 1) {
            System.out.println(1);
        } else {
            int a = 0;
            int b = 1;
            int c;

            System.out.println(a);
            System.out.println(b);

            for (int i = 2; i < lastFibonacci; i++) {
                c = a + b;
                System.out.println(c);

                a = b;
                b = c;
            }
        }
    }
}
