package com.training.ocp.sd.strings;

import java.text.Collator;
import java.text.ParseException;
import java.text.RuleBasedCollator;
import java.util.*;

/**
 * 
 * Performs locale-sensitive String comparison. You use this class to build
 * searching and sorting routines for natural language text.
 * 
 * Useful when working with non-English texts.
 * 
 * @author Pavel Seda
 *
 */
public class CollatorExample {

	private static final List<String> MY_LIST = Arrays.asList("chalina", "curioso", "llama", "luz");

	private static final String SMALL_N_TILDE = new String("\u00F1"); // ñ
	private static final String CAPITAL_N_TILDE = new String("\u00D1"); // Ñ

	private static final String TRADITIONAL_SPANISH_RULES = ("< a,A < b,B < c,C " + "< ch, cH, Ch, CH "
			+ "< d,D < e,E < f,F " + "< g,G < h,H < i,I < j,J < k,K < l,L " + "< ll, lL, Ll, LL " + "< m,M < n,N "
			+ "< " + SMALL_N_TILDE + "," + CAPITAL_N_TILDE + " " + "< o,O < p,P < q,Q < r,R "
			+ "< s,S < t,T < u,U < v,V < w,W < x,X " + "< y,Y < z,Z");

	public static void main(String[] args) {
		usCollator();

		System.out.println();

		ruleBasedCollator();
	}

	/**
	 * Provides sorting based on specific Locale.
	 */
	private static void usCollator() {
		// Define a collator for US English.
		Collator collator = Collator.getInstance(Locale.US);
		// Sort the list base on the collator
		Collections.sort(MY_LIST, collator);
		for (String someWord : MY_LIST) {
			System.out.println("Some word = " + someWord);
		}
	}

	/**
	 * Provides sorting based on given rules.
	 */
	private static void ruleBasedCollator() {
		RuleBasedCollator spCollator;
		try {
			spCollator = new RuleBasedCollator(TRADITIONAL_SPANISH_RULES);
			Collections.sort(MY_LIST, spCollator);
			for (String someWord : MY_LIST) {
				System.out.println("Some word = " + someWord);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
