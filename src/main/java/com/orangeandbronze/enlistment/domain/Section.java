package com.orangeandbronze.enlistment.domain;

public class Section {
	private final String section_id;
	private Subject subject;
	private Schedule schedule;
	private Faculty faculty;
	private Room room;
	private int version = 0;
	
	public Section(String section_id, Subject subject, Schedule schedule, Faculty faculty, Room room) {
		this.section_id = section_id;
		this.subject = subject;
		this.schedule = schedule;
		this.faculty = faculty;
		this.room = room;
	}
	
	
	@Override
	public String toString() {
		return "Section [section_id=" + section_id + ", subject=" + subject + ", schedule=" + schedule + ", faculty="
				+ faculty + ", room=" + room + ", version=" + version + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((faculty == null) ? 0 : faculty.hashCode());
		result = prime * result + ((room == null) ? 0 : room.hashCode());
		result = prime * result + ((schedule == null) ? 0 : schedule.hashCode());
		result = prime * result + ((section_id == null) ? 0 : section_id.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
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
		Section other = (Section) obj;
		if (faculty == null) {
			if (other.faculty != null)
				return false;
		} else if (!faculty.equals(other.faculty))
			return false;
		if (room == null) {
			if (other.room != null)
				return false;
		} else if (!room.equals(other.room))
			return false;
		if (schedule == null) {
			if (other.schedule != null)
				return false;
		} else if (!schedule.equals(other.schedule))
			return false;
		if (section_id == null) {
			if (other.section_id != null)
				return false;
		} else if (!section_id.equals(other.section_id))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		if (version != other.version)
			return false;
		return true;
	}
	
	

}
