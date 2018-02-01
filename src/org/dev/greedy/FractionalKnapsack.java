package org.dev.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Knapsack{
	
	public static int counter = 0;
	private int weight;
	private int benefit;
	private int ratio;
	private int itemNumber;
	
	public Knapsack (int weight,int benefit){
		this.itemNumber = ++ counter;
		this.weight = weight;
		this.benefit = benefit;
		this.ratio =  this.benefit / this.weight;
	}
	
	public int getItem() {
		return this.counter;
	}
	public int getRatio() {
		return this.ratio;
	}
	public int getWeight() {
		return this.weight;
	}
	public int getBenefit() {
		return this.benefit;
	}
	
	public static Comparator <Knapsack> ratioComparator = new Comparator<Knapsack>() {
		@Override
		public int compare(Knapsack k1, Knapsack k2) {
			return k2.getRatio()-k1.getRatio();
		}
	};
}




public class FractionalKnapsack {
	public static void main(String args[]) {
		ArrayList <Knapsack> ListOfKnapsack = new ArrayList();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter total weight : ");
		int weight = sc2.nextInt();
		sc2.close();
		int index = 0;

			
			Knapsack obj = new  Knapsack(10,60); // 6
			ListOfKnapsack.add(obj);
			 obj = new  Knapsack(20,100);   // 5
			ListOfKnapsack.add(obj);
			 obj = new  Knapsack(30,120);   // 4
			ListOfKnapsack.add(obj);
			
		Collections.sort(ListOfKnapsack,Knapsack.ratioComparator);
		for (int i =0; i <ListOfKnapsack.size();i++) {
			System.out.println("Ratio"+ListOfKnapsack.get(i).getRatio());
		}
		
		double totalBenefit = 0.0;
		
		for (int i =0; i <ListOfKnapsack.size();i++) {
			int currentWeight = ListOfKnapsack.get(i).getWeight();
			int currentBenefit = ListOfKnapsack.get(i).getBenefit();
			if (ListOfKnapsack.get(i).getWeight() <= weight) {
				System.out.println("Item id added with weight : -"+
						ListOfKnapsack.get(i).getItem()+ "   "+ListOfKnapsack.get(i).getWeight());
				weight = weight - ListOfKnapsack.get(i).getWeight();
				totalBenefit += currentBenefit;
				System.out.println("Weight" + weight);
			}
			else if (weight < ListOfKnapsack.get(i).getWeight() && weight > 0) {
				int remainingWeight =  weight ;
				totalBenefit +=  ((double) remainingWeight/currentWeight) * currentBenefit ;
				System.out.println("Item id added with weight-"+ ListOfKnapsack.get(i).getItem() +" Benefit " + (double)
						remainingWeight/currentWeight + " out of " + currentBenefit); 
			}
			
		}
		System.out.println("Total benefit accumulated"+totalBenefit);
	}

}
