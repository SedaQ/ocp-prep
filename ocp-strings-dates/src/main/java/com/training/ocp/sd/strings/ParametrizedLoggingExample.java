package com.training.ocp.sd.strings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author Pavel Seda
 *
 */
public class ParametrizedLoggingExample {

	private static final Logger LOG = LoggerFactory.getLogger(ParametrizedLoggingExample.class);

	public static void main(String[] args) {
		String someObj = "My Object Instance";

		parametrizedLogging(someObj);

		concatenationLogging(someObj);
	}

	/**
	 * Is invoked only when particular log level is enabled.
	 * 
	 * Internally uses String format.
	 */
	private static void parametrizedLogging(String someParam) {
		LOG.debug("parametrizedLogging({})", someParam);
	}

	/**
	 * Is invoked always (does not matter if log level is enabled).
	 */
	private static void concatenationLogging(String someParam) {
		LOG.debug("concatenationLogging(" + someParam + ")");
	}

}
