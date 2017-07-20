package com.orangeandbronze.enlistment.domain;

public class Faculty {
	private final int faculty_number;
	private String firstName;
	private String lastName;
	private int version = 0;
	
	public Faculty(int faculty_number, String firstName, String lastName, int version){
		this.faculty_number = faculty_number;
		this.firstName = firstName;
		this.lastName = lastName;
		this.version = version;
	}
	
	public Faculty(int faculty_number, String firstName, String lastName){
		this.faculty_number = faculty_number;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Faculty [faculty_number=" + faculty_number + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", version=" + version + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + faculty_number;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + version;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Faculty other = (Faculty) obj;
		if (faculty_number != other.faculty_number)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (version != other.version)
			return false;
		return true;
	}
	
	
	
}
