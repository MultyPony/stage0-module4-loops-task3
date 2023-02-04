package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int length = ("" + t).length();
        int sum = 0;

        for (int i = 0; i < length; i++, t = t / 10) {
            sum += Math.abs(t % 10);
        }
        System.out.println(sum);
    }
}
