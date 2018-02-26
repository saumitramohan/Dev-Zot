package org.dev.dp;

import java.util.Arrays;
import java.util.Comparator;

class Job {
	int start;
	int end;
	int value;

	public Job(int start, int end, int value) {
		this.start = start;
		this.end = end;
		this.value = value;
	}
}

class ComparatorJob implements Comparator<Job> {

	@Override
	public int compare(Job o1, Job o2) {
		if (o1.end <= o2.end) {
			return -1;
		}
		return 1;
	}

}

public class JobScheduling {

	public static void main(String args[]) {
		Job jobs[] = new Job[4];
		jobs[0] = new Job(3, 10, 20);
		jobs[1] = new Job(1, 2, 50);
		jobs[2] = new Job(6, 19, 100);
		jobs[3] = new Job(2, 100, 200);
		System.out.println("Answer is : " + DynamicJobScheduling(jobs));

	}

	private static int DynamicJobScheduling(Job[] jobs) {
		ComparatorJob comp = new ComparatorJob();
		Arrays.sort(jobs, comp);
		int dp[] = new int[jobs.length];
		for (int i = 0; i < jobs.length; i++) {
			dp[i] = jobs[i].value;
		}
		for (int i = 1; i < jobs.length; i++) {
			for (int j = 0; j < i; j++) {
				if (jobs[j].end <= jobs[i].start) {
					dp[i] = Math.max(dp[i], jobs[i].value + dp[j]);
				}
			}
		}
		int maxSoFar = Integer.MIN_VALUE;
		for (int index = 0; index < dp.length; index++) {

			if (dp[index] > maxSoFar) {
				maxSoFar = dp[index];
			}
		}

		return maxSoFar;
	}

}
