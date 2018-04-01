package org.dev.dp;

public class StepsProblem {
	
	public static void main (String args[]) {
		int position = 19;
		System.out.println("Number of steps required to reach destination " + position+ " is :" + 
		getMinimumSteps(0, 0, position));
	}
	
	public static int getMinimumSteps(int source, int step, int destination) {
		
		if (source == destination) {
			return step;
		}
		if (Math.abs(source) > (destination)) 
            return Integer.MAX_VALUE;
		
		int fPoisition = getMinimumSteps(source+step+1, step+1, destination);
		int nPoisition = getMinimumSteps(source-step-1, step+1, destination);
		
		
		return Math.min(fPoisition, nPoisition);
	}

}
