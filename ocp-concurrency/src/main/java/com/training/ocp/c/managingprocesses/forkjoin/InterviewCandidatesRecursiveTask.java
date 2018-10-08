package com.training.ocp.c.managingprocesses.forkjoin;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

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
public class InterviewCandidatesRecursiveTask extends RecursiveTask<Double> {

	private int start;
	private int end;
	private Double[] evaluations;

	public InterviewCandidatesRecursiveTask(Double[] evaluations, int start, int end) {
		this.start = start;
		this.end = end;
		this.evaluations = evaluations;
	}

	protected Double compute() {
		if (end - start <= 3) {
			double sum = 0;
			for (int i = start; i < end; i++) {
				evaluations[i] = (double) new Random().nextInt(100);
				sum += evaluations[i];
			}
			return sum;
		} else {
			int middle = start + ((end - start) / 2);
			RecursiveTask<Double> otherTask = new InterviewCandidatesRecursiveTask(evaluations, start, middle);
			otherTask.fork();
			return new InterviewCandidatesRecursiveTask(evaluations, middle, end).compute() + otherTask.join();
		}
	}

	public static void main(String[] args) {
		Double[] weights = new Double[10];
		ForkJoinTask<Double> task = new InterviewCandidatesRecursiveTask(weights, 0, weights.length);
		ForkJoinPool pool = new ForkJoinPool();
		Double sum = pool.invoke(task);
		System.out.println("Sum: " + sum);
	}
}
