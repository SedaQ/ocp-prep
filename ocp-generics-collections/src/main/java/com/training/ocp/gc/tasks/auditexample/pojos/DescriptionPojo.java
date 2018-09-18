package com.training.ocp.gc.tasks.auditexample.pojos;

/**
 * 
 * @author Pavel Seda
 *
 */
public class DescriptionPojo extends AbstractAuditPojo {

	private long id;
	private String description;
	private String note;

	public DescriptionPojo() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DescriptionPojo [id=").append(id).append(", description=").append(description).append(", note=")
				.append(note).append(", getTimestamp()=").append(getTimestamp()).append(", getIndex()=")
				.append(getIndex()).append("]");
		return builder.toString();
	}

}
