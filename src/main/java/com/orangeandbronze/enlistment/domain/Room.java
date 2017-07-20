package com.orangeandbronze.enlistment.domain;

public class Room {
	private String room_name;
	private int capacity;
	private int version = 0;


	public Room(String room_name, int capacity, int version) {
		super();
		this.room_name = room_name;
		this.capacity = capacity;
		this.version = version;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacity;
		result = prime * result + ((room_name == null) ? 0 : room_name.hashCode());
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
		Room other = (Room) obj;
		if (capacity != other.capacity)
			return false;
		if (room_name == null) {
			if (other.room_name != null)
				return false;
		} else if (!room_name.equals(other.room_name))
			return false;
		if (version != other.version)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Room [room_name=" + room_name + ", capacity=" + capacity + ", version=" + version + "]";
	}
	
	
}
