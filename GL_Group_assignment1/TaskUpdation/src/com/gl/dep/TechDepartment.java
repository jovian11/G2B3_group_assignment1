package com.gl.dep;

/**
 * Functionality: Technical department class will update department name, Today's Work, Deadline
 * 
 * @author      : Aswin Raj Kumar J, Lahari bhaskar
 * 
 * @since       : 18/6/2023
 */

public class TechDepartment extends SuperDepartment {

	// method to return department name
	@Override
	public String departmentName() {
		return " Tech Department";
	}

	// method to update about today's work
	@Override
	public String getTodaysWork() {
		return"Complete coding of Module 1.";
	}

	// method to update about work deadline
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	// method to update about technical information 
	public String getTechStackInformation() {
		return "Core Java";
	}
	
}
