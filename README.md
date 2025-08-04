# -Minimum-Number-of-Platforms-Required-
🚉 Solves the "Minimum Platforms Required" problem in Java using Sorting + Two-Pointer technique. Efficient approach with O(n log n) time to handle overlapping train schedules.
**Problem Statement**:
Given the arrival and departure times of trains at a station, find the minimum number of platforms required so that no train waits.

A platform is needed for every train that is at the station at the same time.

**Approach**
Sort both arrival[] and departure[] arrays.

Use two pointers to simulate events:

If the next train arrives before a departure, increment the platform count.

If a train departs, reduce the platform count.

Track the maximum platform count required at any moment.

**Code Summary**
Language: Java

Time Complexity: O(n log n)

Space Complexity: O(1)

**Example**
Input:
arrival[]  = {900, 940, 950, 1100, 1500, 1800}
departure[] = {910, 1200, 1120, 1130, 1900, 2000}
Output: Minimum platforms required: 3

**Author**
Priyanshu Sharma
B.Tech CSE @ Galgotias University
Exploring DSA, Java, GitHub Projects

**Source**
This problem is based on:
GeeksforGeeks – Minimum Number of Platforms

