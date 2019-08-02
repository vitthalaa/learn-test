/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestZal {

    public static int findMaxValue(int K, int N, int[] Weights , int[] Values)
    {
        int maxValue = 0;
        int maxWeight = 0;

        // Write your code here.
        // You do not need to code outside of this function but feel free to create different functions for your usage.
        //Set<Integer> sums = new HashSet<>();
        //sums.add(maxValue);

        Map<Integer, Integer> sumsMap = new HashMap<>();
        sumsMap.put(maxValue, maxValue);

        for (int i = 0; i < N; i++) {
            Map<Integer, Integer> newSumsMap = new HashMap<>();
            for (Map.Entry<Integer, Integer> sumPair : sumsMap.entrySet()) {
                int valueSum = sumPair.getKey() + Values[i];
                int weightSum = sumPair.getValue() + Weights[i];
                if (valueSum > K || weightSum > K) {
                    continue;
                }

                if (newSumsMap.get(valueSum) != null && newSumsMap.get(valueSum) > weightSum) {
                    continue;
                }

                if (sumsMap.get(valueSum) != null && sumsMap.get(valueSum) > weightSum) {
                    continue;
                }

                newSumsMap.put(valueSum, weightSum);

                if (valueSum > maxValue) {
                    maxValue = valueSum;
                    maxWeight = weightSum;
                }
            }

            sumsMap.putAll(newSumsMap);

            System.out.println("Checked on:" + i + ", maxValue:" + maxValue);
            System.out.println(sumsMap);
        }

        return maxValue;
    }

    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = br.readLine();
        String[] firstLineArr = firstLine.split(" ");
        int K = Integer.parseInt(firstLineArr[0]);
        int N = Integer.parseInt(firstLineArr[1]);

        String secondLine = br.readLine();
        String[] secondLineArr = secondLine.split(" ");
        int[] Weights = new int[N];
        for (int i = 0; i < N; i++) {
            Weights[i] = Integer.parseInt(secondLineArr[i]);
        }

        String thirdLine = br.readLine();
        String[] thirdLineArr = thirdLine.split(" ");
        int[] Values = new int[N];
        for (int i = 0; i < N; i++) {
            Values[i] = Integer.parseInt(thirdLineArr[i]);
        }

        System.out.println(findMaxValue(K, N, Weights, Values));
    }
}