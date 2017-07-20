package com.orangeandbronze.enlistment.domain;

import com.orangeandbronze.enlistment.enums.Day;
import com.orangeandbronze.enlistment.enums.Period;

public class Schedule {
	private Day day;
	private Period period;
	
	
	public Schedule(Day day, Period period) {
		super();
		this.day = day;
		this.period = period;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + ((period == null) ? 0 : period.hashCode());
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
		Schedule other = (Schedule) obj;
		if (day != other.day)
			return false;
		if (period != other.period)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Schedule [day=" + day + ", period=" + period + "]";
	}
	
	
}
