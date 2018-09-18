package com.training.ocp.gc.generics;

/**
 * This is the same class as GenericClass without generics.
 * 
 * @author Pavel Seda
 *
 */
public class GenericClassObject {

	private long id;
	private Object data;

	public GenericClassObject(long id, Object data) {
		this.id = id;
		this.data = data;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GenericClass [id=").append(id).append(", data=").append(data).append("]");
		return builder.toString();
	}

	public static void main(String[] args) {
		GenericClassObject genericClass = new GenericClassObject(1, "data1");
		GenericClassObject genericClass2 = new GenericClassObject(1, 3);

		System.out.println(genericClass.toString());
		System.out.println(genericClass2.toString());
	}

}
