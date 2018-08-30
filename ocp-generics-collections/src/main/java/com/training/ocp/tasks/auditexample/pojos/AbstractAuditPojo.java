package com.training.ocp.tasks.auditexample.pojos;

/**
 * 
 * @author Pavel Seda
 *
 */
public abstract class AbstractAuditPojo {

	private long timestamp;
	private String index;

	public AbstractAuditPojo() {
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AbstractAuditPojo [timestamp=").append(timestamp).append(", index=").append(index).append("]");
		return builder.toString();
	}

}
