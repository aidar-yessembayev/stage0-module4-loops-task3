package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int answer = 0;

        for (int i = firstBoarder; i <= secondBoarder; i++) {
            answer += i;
        }

        System.out.println(answer);
    }
}
