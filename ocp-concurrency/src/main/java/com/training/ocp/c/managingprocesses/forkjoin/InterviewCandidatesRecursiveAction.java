package com.training.ocp.c.managingprocesses.forkjoin;

import java.util.*;
import java.util.concurrent.*;

/**
 * 
 * Applying the fork/join framework requires us to perform three steps:
 * <ul>
 * <li>Create a ForkJoinTask</li>
 * <li>Create the ForkJoinPool</li>
 * <li>Start the ForkJoinTask</li>
 * </ul>
 * 
 * @author Pavel Šeda
 *
 */
public class InterviewCandidatesRecursiveAction extends RecursiveAction {

	private int start;
	private int end;
	private Double[] evaluation;

	public InterviewCandidatesRecursiveAction(Double[] evaluation, int start, int end) {
		this.start = start;
		this.end = end;
		this.evaluation = evaluation;
	}

	protected void compute() {
		if (end - start <= 3)
			for (int i = start; i < end; i++) {
				evaluation[i] = (double) new Random().nextInt(100);
				System.out.println("Candidate evaluation: " + i);
			}
		else {
			int middle = start + ((end - start) / 2);
			System.out.println("[start=" + start + ",middle=" + middle + ",end=" + end + "]");
			invokeAll(new InterviewCandidatesRecursiveAction(evaluation, start, middle),
					new InterviewCandidatesRecursiveAction(evaluation, middle, end));
		}
	}

	public static void main(String[] args) {
		Double[] evaluation = new Double[10];
		ForkJoinTask<?> task = new InterviewCandidatesRecursiveAction(evaluation, 0, evaluation.length);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(task);
		// Evaluations
		System.out.println();
		System.out.print("Evaluations: ");
		Arrays.asList(evaluation).stream().forEach(d -> System.out.print(d.intValue() + " "));
	}
}
