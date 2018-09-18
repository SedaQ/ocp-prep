package com.training.ocp.fp.primitivestreams;

import java.util.LongSummaryStatistics;
import java.util.stream.LongStream;

/**
 * 
 * @author Pavel Seda
 *
 */
public class SummarizingStatistics {

	public static void main(String[] args) {
		range(LongStream.range(1L, 10_000L));
	}

	private static long range(LongStream longs) {
		LongSummaryStatistics stats = longs.summaryStatistics();
		if (stats.getCount() == 0)
			throw new RuntimeException();
		return stats.getMax() - stats.getMin();
	}
}
