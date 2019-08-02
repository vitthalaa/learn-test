public class MinCostTktTest {


    public static int solution(int[] arr) {
        boolean[] isTravelDay = new boolean[31];
        for (int day: arr) {
            isTravelDay[day] = true;
        }

        int[] minCostUpToDay = new int[31];
        minCostUpToDay[0] = 0;
        for (int day = 1; day <= 30; ++day) {
            if (!isTravelDay[day]) {
                minCostUpToDay[day] = minCostUpToDay[day - 1];
            }

            int minCost = minCostUpToDay[day -1] + 2;

            for(int prevDay = Math.max(0, day-7); prevDay <= day - 4; ++prevDay) {
                minCost = Math.min(minCost, minCostUpToDay[day-1] + 7);
            }

            minCost = Math.min(minCost, 25);

            minCostUpToDay[day] = minCost;
        }

        return minCostUpToDay[30];
    }


    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 7, 29, 30};

        int minimumCostTicket = solution(a);

        System.out.println("Min Cost:" + minimumCostTicket);
    }
}
