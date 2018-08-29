package com.training.ocp.generics;

import java.util.ArrayList;
import java.util.List;

public class LegacyCodeWithoutGenerics {

	public static void main(String[] args) {
		List programmers = new ArrayList();
		addProgrammer(programmers);
		// This will not compile
		// LegacyProgrammer programmer1 = programmers.get(0);
		// this will throw ClassCastException
		LegacyProgrammer programmer2 = (LegacyProgrammer) programmers.get(0);
	}

	private static void addProgrammer(List programmers) {
		programmers.add(new LegacyEmployee());
	}
}

class LegacyEmployee {

}

class LegacyProgrammer {

}
