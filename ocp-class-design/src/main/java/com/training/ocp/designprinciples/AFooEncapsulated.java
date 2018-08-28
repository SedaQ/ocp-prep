package com.training.ocp.designprinciples;

/**
 * 
 * @author Pavel Šeda
 *
 */
public class AFooEncapsulated {

	private long id;
	private String email;

	public AFooEncapsulated(long id, String email) {
		super();
		this.id = id;
		this.email = email;
	}

	protected long getId() {
		return id;
	}

	protected void setId(long id) {
		this.id = id;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

}
