package org.dev.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class JobDetail {
	private char jobId;
	private int deadLine;
	public char getJobId() {
		return jobId;
	}
	public void setJobId(char jobId) {
		this.jobId = jobId;
	}
	public int getDeadLine() {
		return deadLine;
	}
	public void setDeadLine(int deadLine) {
		this.deadLine = deadLine;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
	private int profit;
	
	public JobDetail (char jobId, int deadLine, int profit ){
		this.jobId = jobId;
		this.deadLine = deadLine;
		this.profit = profit;
	}
	public static Comparator <JobDetail> jds = new Comparator<JobDetail>() {
		@Override
		public int compare(JobDetail jd1, JobDetail jd2) {
			return jd2.getProfit() - jd1.getProfit();
		}
	};
}

public class SchedulingProblem {
	
	public static void main(String args[]) {
		ArrayList <JobDetail> jobDetailList = new ArrayList<>();
		
		JobDetail object = new JobDetail('a',2,100);
		jobDetailList.add(object);
		object = new JobDetail('b',1,19);
		jobDetailList.add(object);
		object = new JobDetail('c',2,27);
		jobDetailList.add(object);
		object = new JobDetail('d',1,25);
		jobDetailList.add(object);
		object = new JobDetail('e',3,15);
		jobDetailList.add(object);
		int size = jobDetailList.size();
		Collections.sort(jobDetailList,JobDetail.jds);
		
		boolean schedulingArray[] = new boolean[size];
		int resultArray[] = new int [size];
		
		for (int i = 0; i< size ; i++) {
			schedulingArray[i] = false;
		}
		for (int i=0; i< size; i++) {
			for (int j = Math.min(jobDetailList.get(i).getDeadLine(), size) -1 ; j >=0; j--) {
				if (schedulingArray[j] == false) {
					resultArray[j] = i;
					schedulingArray[j] = true;
					break;
				}
			}
		}
		
		for (int i =0; i< size ; i++) {
			if (schedulingArray[i])
			System.out.println("Job number :"+ jobDetailList.get(resultArray[i]).getJobId());
		}
			
			
	}
		
	}


