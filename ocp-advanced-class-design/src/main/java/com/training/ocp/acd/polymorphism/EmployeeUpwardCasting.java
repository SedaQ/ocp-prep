package com.training.ocp.acd.polymorphism;

/**
 * 
 * @author Pavel Seda
 *
 */
public class EmployeeUpwardCasting {

	public static void main(String[] args) {
		FLMUpwardCasting flm = new FLMUpwardCasting();
		SLMUpwardCasting suc = new SLMUpwardCasting();
		EmployeeUpwardCasting euc1 = flm;
		EmployeeUpwardCasting euc2 = suc;
	}
}

class FLMUpwardCasting extends EmployeeUpwardCasting {
}

class SLMUpwardCasting extends FLMUpwardCasting {
}
