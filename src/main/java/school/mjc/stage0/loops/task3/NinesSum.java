package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        String digitsStr = "9";

        for (int i = 1; i <= lengthOfLastNumber; i++) {
            sum += Integer.parseInt(digitsStr.repeat(i));
        }
        System.out.println(sum);
    }
}
