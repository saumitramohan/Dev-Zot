package org.dev.multithreading;

public class Race implements Runnable {
	
	private String winner = null;
	
	public void race () {
		for (int i = 0; i < 100; i++) {
			System.out.println("Distance covered by thread :"+Thread.currentThread().getName()+": is"+i);
			boolean isRaceWon = this.isRaceWon(i);
			if(isRaceWon) {
				break;
			}
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.race();
		
	}
	
	private boolean isRaceWon(int distance) {
		if(winner == null && distance == 99) {
			System.out.println("Race is won by"+ Thread.currentThread().getName());
			this.winner = Thread.currentThread().getName();
			return true;
		}
		else if(this.winner == null) {
			return false;
		}
		else if (this.winner !=null)
			return true;
		return false;
	}

}
