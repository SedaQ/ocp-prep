package com.training.ocp.acd.polymorphism;

/**
 * 
 * @author Pavel Seda
 *
 */
public class EmployeeDownwardCasting {

	public static void main(String[] args) {
		EmployeeDownwardCasting e1 = new EmployeeDownwardCasting();
		FirstLineManager flm = (FirstLineManager) e1;
		// TeamLeader tl = flm; // does not compile
	}
}

class FirstLineManager extends EmployeeDownwardCasting {

}

class SecondLineManager extends FirstLineManager {

}

class TeamLeader extends EmployeeDownwardCasting {
}
