package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        for (int last = 0, current = 1, counter = 1; counter <= lastFibonacci; counter++) {
            if (counter == 1) {
                System.out.println(last);
            } else if (counter == 2) {
                System.out.println(current);
            } else {
                System.out.println(last + current);
                int t = last;
                last = current;
                current = current + t;
            }
        }
    }
}
