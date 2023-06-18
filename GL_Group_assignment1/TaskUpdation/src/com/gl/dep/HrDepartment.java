package com.gl.dep;

/**
 * Functionality: HR department class will update department name, Today's Work, Deadline
 * 
 * @author      : Aswin Raj Kumar J, Lahari bhaskar
 * 
 * @since       : 18/6/2023
 */

public class HrDepartment extends SuperDepartment {

	// method to return department name
	@Override
	public String departmentName() {
		return " HR Department";
	}

	// method to update about today's work 
	@Override
	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance.";
	}
	
    // method to update about work deadline
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD.";
	}
	
	// method to update about activity
	public String doActivity() {
		return "Team Lunch";
		
	}
	

}
