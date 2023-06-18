package com.gl.dep;

/**
 * Functionality: SuperDepartment class is a base class which is extended to Admin department, HR department, Tech Department using hierarchical inheritance
 *                To update the holiday status  
 * 
 * @author      : Aswin Raj Kumar J, Lahari bhaskar
 * 
 * @since       : 18/6/2023
 */

public class SuperDepartment {
	
	// method to return department name
	public String departmentName() {
		return " Super Department";
	}
	
	// method to return about today's work
	public String getTodaysWork() {
		return "No Work as of now";
	}
	
	// method to return about work deadline
	public String getWorkDeadline() {
		return "Nil";
	}
	
	// method to return about holiday
	public String isTodayAHoliday() {
		return "Today is not a Holiday";
	}

}
