package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String num = t + "";

        int answer = 0;

        for (int i = 0; i < num.length(); i++) {
            int number = Character.getNumericValue(num.charAt(i));
            if (number > 0) {
                answer += number;
            }
        }

        System.out.println(answer);
    }
}
