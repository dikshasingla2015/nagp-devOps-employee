package com.deveops.java.employee.dto;

public class EmployeeBEObjectBaseResponse extends EmployeeBEBaseResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6714417828079704569L;

	private Object data;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeeBEObjectBaseResponse [data=");
		builder.append(data);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}

}
