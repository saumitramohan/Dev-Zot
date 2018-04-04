package org.dev.design;

import java.util.List;

public class CallCenterHandler {

	List <List <Employee>> employeeLevels;
	List <List <Call>> callQueues;
	
	public Employee getHandlerForCall (Call call) {
		return new Director();
	}
	
	public void dispatchCall (Caller caller) {
		Call call = new Call(caller);
		Employee employee = getHandlerForCall(call);
		if (employee != null) {
			employee.answerCall(call);
			call.handler = employee;
		}
		else {
			//callQueues.get(call.getRank..);
		}
		
	}
	
	
}


class Call {
	
	protected Caller caller;
	protected Employee handler;
	protected Rank rank;
	
	// Constructor
	
	public Call (Caller c) {
		this.caller = c;
		rank = Rank.Repondent;
	}
	
	
	
}

class Caller {
	
}

abstract class Employee {

	private String name;
	protected Rank rank;
	private Call currentCall = null;

	// Answer call

	public void answerCall(Call call) {
		// ----
		currentCall = call;
	}

	public boolean isFree() {
		return currentCall == null;
	}

	public void esclateAndReassignCall(Call call) {

	}

	public void disconnectCall() {

	}

}

class Respondent extends Employee {
	public Respondent() {
		rank = Rank.Repondent;
	}

}

class Manager extends Employee {
	public Manager() {
		rank = Rank.Manager;
	}

}

class Director extends Employee {
	public Director() {
		rank = Rank.Director;
	}
}

enum Rank {
	Repondent, Manager, Director;
}
