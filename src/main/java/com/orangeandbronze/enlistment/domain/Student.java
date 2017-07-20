package com.orangeandbronze.enlistment.domain;

public class Student {
	private final int student_number;
	private String lastName;
	private String firstName;
	
	public Student(int student_number, String lastName, String firstName) {
		this.student_number = student_number;
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	@Override
	public String toString() {
		return "Student [student_number=" + student_number + ", lastName=" + lastName + ", firstName=" + firstName
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + student_number;
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
		Student other = (Student) obj;
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
		if (student_number != other.student_number)
			return false;
		return true;
	}
	
	

}
