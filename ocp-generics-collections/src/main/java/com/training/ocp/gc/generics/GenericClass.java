package com.training.ocp.gc.generics;

/**
 * 
 * 
 * Following list is a naming convention for generics:
 * <ul>
 * <li>E for an element</li>
 * <li>K for a map key</li>
 * <li>V for a map value</li>
 * <li>N for a number</li>S
 * <li>T for a generic data type</li>
 * <li>S,U,V, and so forth for multiple generic types</li>
 * </ul>
 * 
 * In compile type this class is change to Object (this is called type erasure)
 * - this approach is done because of backward compatability with version which
 * do not contain generics
 * 
 * @author Pavel Seda
 *
 * @param <T>
 */
public class GenericClass<T> {

	private long id;
	private T data;

	public GenericClass(long id, T data) {
		this.id = id;
		this.data = data;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GenericClass [id=").append(id).append(", data=").append(data).append("]");
		return builder.toString();
	}

	public static void main(String[] args) {
		GenericClass<String> genericClass = new GenericClass<>(1, "data1");
		System.out.println(genericClass.toString());
	}

}
