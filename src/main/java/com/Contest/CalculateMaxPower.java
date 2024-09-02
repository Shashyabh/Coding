package com.Contest;

import com.sun.source.tree.UsesTree;

import java.util.Arrays;
import java.util.HashSet;

public class CalculateMaxPower {
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        int[] power = {7,1,6,6};
        Arrays.sort(power);
        System.out.println(calculateMaxPower(power)); // Output: 10
    }

    public static int calculateMaxPower(int[] power) {
        Arrays.sort(power); // Sort the power array

        // Initialize variables
        HashSet<Integer> used = new HashSet<>();
        int total = 0;

        return f(power, 0, used, total);
    }

    public static int f(int[] power, int index, HashSet<Integer> used, int total) {
        if (index == power.length) {
            return total; // Base case: return the accumulated total
        }

        // Option 1: Skip the current spell
        int notPick = f(power, index + 1, used, total);
        //System.out.println(used);
        // Option 2: Pick the current spell if it doesn't conflict with previous picks
        int pick = 0;
        if (!used.contains(power[index] - 2) && !used.contains(power[index] - 1)
                && !used.contains(power[index] + 1) && !used.contains(power[index] + 2)) {

            used.add(power[index]);
            pick = power[index] + f(power, index + 1, used, total );
        }

        // Return the maximum of picking or not picking the current spell
        return Math.max(notPick, pick);
    }
}
