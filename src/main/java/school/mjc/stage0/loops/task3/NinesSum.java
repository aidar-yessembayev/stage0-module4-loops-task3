package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber <= 0) {
            System.out.println(0);
        } else {
            int answer = 0;

            for (int i = 1; i <= lengthOfLastNumber; i++) {
                String num = "";

                for (int j = 0; j < i; j++) {
                    num += "9";
                }

                answer += Integer.parseInt(num);

            }

            System.out.println(answer);
        }
    }
}
