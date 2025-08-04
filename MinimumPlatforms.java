/*
  Source: GeeksforGeeks - Minimum Platforms Problem
  Link: https://www.geeksforgeeks.org/minimum-number-of-platforms-required-for-a-railwaystation/
  Modified and Uploaded by: Priyanshu Sharma
*/

import java.util.Arrays;

public class MinimumPlatforms {

    // Function to calculate the minimum number of platforms required
    public static int findMinimumPlatforms(int[] arrival, int[] departure) {
        int n = arrival.length;

        // Sort arrival and departure arrays
        Arrays.sort(arrival);
        Arrays.sort(departure);

        // Count of platforms needed at the moment
        int platforms = 0;
        int maxPlatforms = 0;

        // Two pointers: i for arrival, j for departure
        int i = 0, j = 0;

        // Process all trains
        while (i < n && j < n) {
            // New train arrives before the earliest one departs → need more platform
            if (arrival[i] <= departure[j]) {
                platforms++;
                i++;
            } else {
                // A train has departed → free a platform
                platforms--;
                j++;
            }

            // Update max platforms required
            maxPlatforms = Math.max(maxPlatforms, platforms);
        }

        return maxPlatforms;
    }

    public static void main(String[] args) {
        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};

        int result = findMinimumPlatforms(arrival, departure);
        System.out.println("Minimum platforms required: " + result);
    }
}
